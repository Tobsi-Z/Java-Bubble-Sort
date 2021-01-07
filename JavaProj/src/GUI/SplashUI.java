/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/**
 *
 * @author Tobsi
 */
public class SplashUI extends JWindow
{
    
    // Splashscreen ------------------------------------------------------------
    
    public SplashUI() throws MalformedURLException, IOException {
        
        File ImgFilePath = new File("BobleSort.png"); // finder filens path
        
        JLabel label = new JLabel("", new ImageIcon("BobleSort.png"), SwingConstants.CENTER); // et nyt lable bliver skabt, og (String text, Icon icon, int horizontalAlignment) bliver sat
        
        BufferedImage wPic = ImageIO.read(this.getClass().getResource("BobleSort.png")); // billedet bliver "gæmt"
        
        JLabel wIcon = new JLabel(new ImageIcon(wPic)); // Billedet bliver til et ikon som bliver brugt til at vise billedet, kan ikke bare smide et billede på skermen af en eller anden grund?
        
        //wIcon.reshape(0, 0, 100, 100); // Prøver at ændre billedet jeg bruger, men det virker ikke helt, ved ikke hvorfor?
        
        JWindow window = new JWindow(); // Laver et nyt vindu
        window.getContentPane().add(wIcon); // insætter det ikon/logo jeg har valgt
        window.setSize(810, 810); // Størelsen af vinduet/biledet // tilføjede en margin på 8 px. går splash billedet lidt mere venligt at se på
        window.setAlwaysOnTop(true); // gør at vinduet er forest uanset hvad man gør (KUN VED SPLASH SCREENEN)
        window.setLocationRelativeTo(null); // sætter vinduet i midten af brugerens skærm
        window.setVisible(true); // gør det synligt
        try {
            Thread.sleep(1500); // SET TIL 1500 (1.5 sekunder). Føles mere "rigtig".
        }
        catch (InterruptedException e) { // en catch hvis der sker nogle fejl
            
        }
        window.setVisible(false); // fjerer vinduet så brugeren ikke kan se det
        window.dispose(); // "Lukker" for vinduet med splash/logoet
        
    }
    
    // Splashscreen END --------------------------------------------------------
    
}
