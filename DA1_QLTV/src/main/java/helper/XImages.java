/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Admin
 */
public class XImages {
    public static Image getAppIcon() {
        URL url = XImages.class.getResource("");
        return new ImageIcon(url).getImage();
    }
}
