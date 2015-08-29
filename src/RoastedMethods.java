public class RoastedMethods
{
	public static void main(String[] args)
	{
		RoastedMethods methods = new RoastedMethods();
		methods.iRock("Siena");
		methods.rocker("Bob");
		methods.truth("Justin Bieber");
		methods.echo("beer");
		methods.repeat("Hola", 4);
		methods.getTheBestCoder("you");
		methods.add(2,2);
		
	}

	void iRock(String person)
	{
		System.out.println(person + " rocks");
	}

	void rocker(String rocks)
	{
		System.out.println(rocks + " rocks");
	}
	
	void truth(String name)
	{
		if (name.equals("TSwizzle")){
			System.out.println(name + " is awesome");
		}
		if (name.equals("Justin Bieber")){
			System.out.println(name + " sucks");
		}
			
	}
	
	void echo(String drink)
	{
		for (int i = 0; i < 2; i++)
		{
			System.out.println(drink );
		}
	}
	
	void repeat(String hi, int number){
		for (int i = 0; i < number; i++)
		{
			System.out.println(hi);
		}
	}
	
	void getTheBestCoder(String theBest)
	{
		System.out.println(theBest);
	}
	
	int add(int one, int two)
	{
		int sum =(one+ two);
		return sum;
		
	}


}
