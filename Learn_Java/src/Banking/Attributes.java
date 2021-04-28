package Banking;

public class Attributes {
	
	String firstName;
	int age;
	float balance;
	boolean eligible;
	
	
	public void iseligible(){
		if (age > 25 && balance >= 2000){
			eligible=true;
		}
	}

}
