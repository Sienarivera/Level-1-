import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player extends GameObject
{
	
	public Player(int x, int y, int w, int h, BufferedImage p)
	{
		super(x, y, w, h, p);
		
	}

	//int x, y, width, height;
	//BufferedImage picture;
	
	
	
	public void update()
	{
		
	
	}
	
	public void paint(Graphics g)
	{
		g.drawImage(picture, x, y, width, height,null);
	}
}
