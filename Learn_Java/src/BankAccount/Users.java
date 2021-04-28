package BankAccount;

public class Users {

	public static void main(String[] args) {
		AccountAttributes tom = new AccountAttributes();
		
		tom.firstname = "tom";
		tom.lastName = "Smith";
		tom.age = 26;
		tom.balance= 20000;
		tom.testEligibility();
		
		System.out.println("Is tom eligible "+ tom.eligible);

	}

}
