
public class Disease {

		
	

	boolean isPandemic;
	String symptoms;
	float chanceOfSurvival;
	
	
	
	Disease (boolean isPandemic, String symptoms, float chanceOfSurvival)
	{
		this.isPandemic = isPandemic;
		this.symptoms = symptoms;
		this.chanceOfSurvival = chanceOfSurvival;
		
	}
	
	public static void main(String[] args) {
	Disease Blah = new Disease(true, "None", 10);
	Disease Stun = new Disease(false, "Health care and regualr doctor visits", 95);
	
	
	
	}
	
	
}
