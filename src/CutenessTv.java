import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.Colors;

public class CutenessTv implements ActionListener
{
	public static void main(String[] args)
	{
		CutenessTv tele = new CutenessTv();
		tele.createUI();
	}
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonDuck = new JButton("Ducks");
	JButton buttonFrog = new JButton("Frog");
	JButton buttonUnicorn = new JButton("Unicorn");
	
		void createUI()
		{
			frame.setVisible(true);
			frame.setSize(300, 100);
			frame.setTitle("Cuteness Tv");
			frame.add(panel);
			panel.setVisible(true);
			panel.setSize(200,50);
			panel.add(buttonDuck);
			panel.setForeground(Colors.getRandomColor());
			panel.add(buttonFrog);
			panel.add(buttonUnicorn);
			buttonDuck.setText("Video Uno");
			frame.setBackground(Colors.getRandomColor());
			
			buttonFrog.setText("Video Dos");
			buttonFrog.setForeground(Colors.getRandomColor());
			buttonUnicorn.setText("Video Tres");
			buttonUnicorn.setForeground(Colors.getRandomColor());
			buttonDuck.setForeground(Colors.getRandomColor());
			buttonDuck.setVisible(true);
			buttonFrog.setVisible(true);
			buttonUnicorn.setVisible(true);
			buttonDuck.addActionListener(this);
			buttonFrog.addActionListener(this);
			buttonUnicorn.addActionListener(this);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		


	void showDucks()
	{
		playVideo("EpiGS-3PDU8");
	}

	void showFrog()
	{
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns()
	{
		playVideo("qRC4Vk6kisY");
	}
	
	void playVideo()
	{
		playVideo("wZZ7oFKsKzY");
	}
	
	void playDucks()
	{
		playVideo("MtN1YnoL46Q");
	}
	
	void playUnicorns()
	{
		playVideo("CsGYh8AacgY");
	}
	void playVideo(String videoID)
	{
		try
		{
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}





	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		System.out.println("Clicked");
		JButton newButton = (JButton) arg0.getSource();
		if(buttonDuck== newButton)
		{
			playVideo();
		}
		if(buttonFrog == newButton)
		{
			playDucks();
		}
		if(buttonUnicorn == newButton)
		{
			playUnicorns();
		}
	
		
		// TODO Auto-generated method stub
		
	}

}
