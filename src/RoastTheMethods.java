import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class RoastTheMethods
{

	void food(String fruit)
	{
		System.out.println("I like " + fruit);
	}

	void truth(int x)
	{
		if (x > 5)
		{
			System.out.println("Geeks rule");
		} else
		{
			System.out.println("Nerds rule");
		}
	}

	void drawLine() {
	Tortoise.setPenColor(Colors.getRandomColor());
	 Tortoise.move(100);
	 Tortoise.turn(90);
	 
	}

	void jump(int height)
	{
		if (height > 100)
		{
			System.out.println("The mouse jumped over the moon.");
		}
		if (height > 50)
		{
			System.out.println("The mouse jumped over the broom.");
		}
		if (height > 5)
		{
			System.out.println("The mouse jumped over the candlestick.");
		}
	}
	void jump(String obstacle)
	{
		System.out.println("The mouse jumped over the "+ obstacle);
	}
	
	
	

	public static void main(String[] args)
	{
		RoastTheMethods methods = new RoastTheMethods();
		methods.food("apples");
		methods.truth(4);
		methods.jump(6);
		methods.jump("piggy");
		for (int i = 0; i < 4; i++)
		{
			methods.drawLine();
		}
		
	}
}
