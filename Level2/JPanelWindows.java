import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;


public class JPanelWindows extends JPanel implements ActionListener
{
	Timer t;
	BufferedImage image, imageE;
	GameObject player, enemy;
	
	
	public JPanelWindows()
	{	
		System.out.println("Blah");
		try
		{
			image = ImageIO.read(this.getClass().getResourceAsStream("t.png"));
			imageE = ImageIO.read(this.getClass().getResourceAsStream("Sans.png"));
		}
		catch(Exception e)
		{
			System.out.println("IT DIDNT WORK");
		}
		player = new Player(100,100,150,150,image);
		enemy = new Enemy(300,200,150,150, imageE);

		t = new Timer(1000/60, this);
		t.start();
		
		
	}
	
	public void paintComponent(Graphics g)
	{
		player.paint(g);
		enemy.paint(g);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}

}
