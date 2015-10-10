

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.teachingextensions.logo.Colors;

public class AnimalJumping {
	 public static void main(String[] args) throws MalformedURLException {
		 

		 	String urlOfAnimalSuckingAtJumping = "http://38.media.tumblr.com/312ea8b1f65093fc7326ddcb3d05ad0a/tumblr_inline_n3i3i59cdt1qz7g1h.gif";
	       
		 
		 JFrame frame = new JFrame();
	
		 frame.setVisible(true);
		 frame.setSize(1000, 1000);
		 frame.setTitle("SuperDog");

		 JLabel label = createImage(urlOfAnimalSuckingAtJumping);
		 frame.setForeground(Colors.getRandomColor());
		 label.setForeground(Colors.getRandomColor());
		 label.setBackground(Colors.getRandomColor());
		 frame.add(label);
		 frame.pack();
		
			 
		

	        /* We want to show an animation of an animal sucking at jumping inside a JFrame.
	         * Once you have chosen from http://animalssuckingatjumping.tumblr.com/, right click and "Copy Image URL" or “Copy Image Address”
	         * Your program must:
	         * 		- show the animation in full without any user interaction. You don’t need a JPanel since it’s only one JComponent.
	         * 		- show the animation in the center of the screen. Clue: frame.setLocationRelativeTo(null)
	         * 		- have a title such as "Gerbil Fail"
	         */

	    }
	 
	 
	 
	 static JLabel createImage(String imageURL) throws MalformedURLException {
		 	URL url = new URL(imageURL);
	        Icon icon = new ImageIcon(url);
	        return new JLabel(icon);
	 }
}


