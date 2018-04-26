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
import static java.lang.Double.max;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.shape.Circle;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Darragh Kearns (kear0057)
 * 
 * Is a panel filled with an image of a map of the Flinders University campus
 * Using the constructor with an x and y coordinate will put a small red circle
 * at that location on the map
 * 
 */
//Future endevour would be to use mouse listeners to add hover notifications saying where each incident is
public class MapWithPointsPanel extends JPanel {

    //Currently hardcoded, can be modified later 
    //private int[] freq = {10, 19, 50, 13, 60};
    //private int[] x = {98, 277, 140, 156, 217};
    //private int[] y = {198, 231, 84, 295, 140};
    //First one is anchor court
    //Second is education
    //Third is hub
    //Fourth is engineering
    //Fifth is humanities courtyard
    
    private int xpoint;
    private int ypoint;
    

//    public int[] getFreq() {
//        return freq;
//    }
//
//    public void setFreq(int[] freq) {
//        this.freq = freq;
//    }
    public MapWithPointsPanel() {
        setPreferredSize(new Dimension(382, 382));
        setVisible(true);

    }

    //Creates a map with the point at a specific place
    public MapWithPointsPanel(int x, int y) {
        xpoint = x;
        ypoint = y;
        setPreferredSize(new Dimension(382, 382));
        setVisible(true);

    }

    public int getXpoint() {
        return xpoint;
    }

    public void setXpoint(int xpoint) {
        this.xpoint = xpoint;
    }

    public int getYpoint() {
        return ypoint;
    }

    public void setYpoint(int ypoint) {
        this.ypoint = ypoint;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Should probably add a try catch here
        URL url = getClass().getResource("flindersmap.png");
        
        //Read in the image into 'image'
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(url.getPath()));
        } catch (IOException ex) {
            Logger.getLogger(MapWithPointsPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Draw the picture at the location 0,0
        g.drawImage(image, 0, 0, null);
        
        //Draw the red circle point
        draw(g);
    }

    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Color color1 = new Color(255, 0, 0, 175); //Creates new color, RGBA
        g2.setColor(color1);
        g2.fillOval(xpoint, ypoint, 20, 20); //Creates a circle at xpoint, ypoint with a radius of 20

    }

}
