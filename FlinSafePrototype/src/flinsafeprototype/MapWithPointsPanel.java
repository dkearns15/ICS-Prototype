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
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Darragh Kearns (kear0057)
 */
public class MapWithPointsPanel extends JPanel {

    public MapWithPointsPanel() {
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
        g2.setColor(Color.red);
        g2.fillOval(100, 100, 100, 100);
    }
    
}
