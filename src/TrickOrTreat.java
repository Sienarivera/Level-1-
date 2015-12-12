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
	public static void main()
	{
		TrickOrTreat trick = new TrickOrTreat();
		
		
	}
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton treat = new JButton();
	JButton trick = new JButton();
	
	public void actionPerformed(ActionEvent e)
	{
		
		
	}
	
	public void createUI()
	{
		frame.add(panel);
		panel.add(treat);
		panel.add(trick);
		
		frame.setForeground(Colors.Oranges.DarkOrange);
		frame.setTitle("Trick or treat!");
		panel.setForeground(Colors.Yellows.Gold);
		treat.setBackground(Colors.Grays.Black);
		trick.setBackground(Colors.Reds.OrangeRed);
		treat.setText("TREAT");
		trick.setText("TRICK");
		
		trick.addActionListener(this);
		treat.addActionListener(this);
		
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
