
public class Minion
{
	String name;
	int eyes;
	String color;
	String master;

	Minion(String names, int eyes, String color, String master){
		this.name = names;
		this.eyes = eyes;
		this.color = color;
		this.master = master; 
		
	}
	
	String getName(){
		return name;
	}
	int getEyes(){
		return eyes;
	}
	String getColor(){
		return color;
	}
	String getMaster(){
		return master;
	}
	
	void setMaster(String masters){
		this.master = masters;
	}

	
}
