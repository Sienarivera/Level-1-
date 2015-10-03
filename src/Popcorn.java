public class Popcorn {

	private int kernels = 20;
	private String flavor;
	
	public static void main(String[] args)
	{
		Popcorn popcorn = new Popcorn("kettle");
		Microwave microwave = new Microwave();
		
		microwave.putInMicrowave(popcorn);
		microwave.setTime(2);
		microwave.startMicrowave();
		
		popcorn.pause();
		popcorn.applyHeat();
		
	}

	Popcorn(String flavor) {
		this.flavor = flavor;
		System.out.println("Popcorn says: making package of " + this.flavor + " popcorn.");
	}
	



	public void applyHeat() {
		pause();

		if (kernels == 0) {
			System.out.println("Popcorn says: Time to eat popcorn!");
		} else {
			System.out.println("POP!" + kernels);
			kernels--;
		}
	}

	private void pause() {
		try {
			Thread.sleep(150);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
