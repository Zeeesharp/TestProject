package Banking;

public class Holder {

	public static void main(String[] args) {
		
		Attributes tom = new Attributes();
		
		tom.firstName = "tom";
		tom.age = 26;
		tom.balance = 20000;
		tom.iseligible();
		
		System.out.println("Is tom eligible ? " + tom.eligible) ;
		
		
	}
}
