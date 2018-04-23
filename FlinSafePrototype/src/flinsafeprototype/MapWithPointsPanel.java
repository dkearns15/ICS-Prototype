/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flinsafeprototype;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.shape.Circle;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Darragh Kearns (kear0057)
 */

//Future endevour would be to use mouse listeners to add hover notifications saying where each incident is

public class MapWithPointsPanel extends JPanel {
    
    
    //Currently hardcoded, can be modified later 
    private int[] freq = {10, 19, 50, 13, 60};
    private int[] x = {98, 277, 140, 156, 217};
    private int[] y = {198, 231, 84, 295, 140};
    private int xpoint;
    private int ypoint;
    //First one is anchor court
    //Second is education
    //Third is hub
    //Fourth is engineering
    //Fifth is humanities courtyard
    
    public int[] getFreq() {
        return freq;
    }

    public void setFreq(int[] freq) {
        this.freq = freq;
    }

    public MapWithPointsPanel() {
        setPreferredSize(new Dimension(382,382));
        setVisible(true);
        
    }
    
    public MapWithPointsPanel(int x, int y) {
        xpoint = x;
        ypoint = y;
        setPreferredSize(new Dimension(382,382));
        setVisible(true);
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        URL url = getClass().getResource("flindersmap.png");
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(url.getPath()));
        } catch (IOException ex) {
            Logger.getLogger(MapWithPointsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.drawImage(image, 0, 0, null);
        draw(g);
    }

    public void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        Color color1 = new Color(255,83,83,150);
        g2.setColor(color1);
        g2.fillOval(xpoint, ypoint, 30, 30);

    }
    
}
