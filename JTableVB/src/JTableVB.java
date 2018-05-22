// Voorbeeld KnopImage
// Opstartklasse voor applicatie met paneel voor twee knoppen en tekstvak
import javax.swing.*;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class JTableVB extends JFrame {

	public static void main( String args[] ) {
		JFrame frame = new JTableVB();
		frame.setSize( 1200, 800 );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.setTitle( "JTabeleApp" );
		JPanel DBpaneel = new JTableVBAppPaneel();
		frame.setContentPane( DBpaneel );
		frame.setVisible( true );


		// nodig om plaatje in het frame te plaatsen
		BufferedImage image = null;

		// try en catch blok om plaatje te laden
		try {
			image = ImageIO.read(
					frame.getClass().getResource("images/mario.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		frame.setIconImage(image);
		//  nodig om plaatje in het frame te plaatsen
	}



}

