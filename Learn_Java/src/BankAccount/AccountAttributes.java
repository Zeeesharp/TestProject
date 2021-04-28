package BankAccount;

public class AccountAttributes {
	
	String firstname;
	String lastName;
	int age;
	float balance;
	boolean eligible;
	
	public void testEligibility(){
		if (age > 25 && balance >= 20000){
			eligible=true;
		}
	}

}
