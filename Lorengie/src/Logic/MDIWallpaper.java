/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.border.Border;

/**
 *Class MDIWallpaper
 * @author Andres
 */
public class MDIWallpaper implements Border {
    
    public BufferedImage back;
    
    public MDIWallpaper(){
        try {
            URL imagePath = new URL(getClass().getResource("/Images/car.jpg").toString()); 
            back = ImageIO.read(imagePath);
        } catch (Exception ex) {            
        }
    }
    /**
     * Method paintBorder
     * @param c Component
     * @param g Graphics
     * @param x int
     * @param y int
     * @param width int
     * @param height int
     */
    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) { 
       g.drawImage(back, 0, 0, width, height, null); 
    }
    /**
     * Get get Border Insets
     * @param c Component
     * @return new Insets
     */
    @Override
    public Insets getBorderInsets(Component c) { 
        return new Insets(0,0,0,0); 
    }
    /**7
     * Method is Border Opaque
     * @return false
     */
    @Override
    public boolean isBorderOpaque() {
        return false;
    }
    
}
