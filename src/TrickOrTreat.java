import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.teachingextensions.logo.Colors;

public class TrickOrTreat implements ActionListener
{
	public static void main(String[] args)
	{
		TrickOrTreat trick = new TrickOrTreat();
		trick.createUI();
		
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton treat = new JButton();
	JButton trick = new JButton();
	

	
	public void createUI()
	{
	
		frame.add(panel);
		frame.setSize(500, 500);
		panel.add(treat);
		panel.add(trick);
		
		frame.setBackground(Colors.Oranges.DarkOrange);
		frame.setTitle("Trick or treat!");
		
		panel.setBackground(Colors.Yellows.Gold);
		treat.setSize(100,200);
		trick.setSize(100,200);
		
		treat.setForeground(Colors.Grays.Black);
		treat.setBackground(Colors.Grays.Gray);
		trick.setForeground(Colors.Reds.OrangeRed);
		treat.setText("TREAT");
		trick.setText("TRICK");
		
		trick.addActionListener(this);
		treat.addActionListener(this);
		frame.setVisible(true);
		panel.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent arg0)
	{
		JButton newButton = (JButton)arg0.getSource();
		if(trick==newButton)
		{
			showPictureFromTheInternet("http://boomansion.net/media/artwork/mpa/boo.jpg");
			
		}
		else if(treat==newButton)
		{
			showPictureFromTheInternet("https://s-media-cache-ak0.pinimg.com/736x/fc/54/f0/fc54f08977d4d52801958db7c54d7a55.jpg");
			
		}
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}


}
