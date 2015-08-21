public class Person {
	
	
	String superpower;
	String name;
	
	public String toString(){
		return superpower + name;
		
	}
	
	Person(String superpower, String name){
		this.superpower = superpower;
		this.name = name;
	}
	public static void main(String[] args) {
		Person Siena = new Person("Being bad at making up a superpower", "Siena");
		
	}
	
	void setsuperpower(String sp)  {
		this.superpower = sp;
	}
	
	void setname(String newname){
		this.name = newname;
	}
	
	String getname(){
		return name;
	}
	
	String getsuperpower(){
		return superpower;
	}
	
	
}
