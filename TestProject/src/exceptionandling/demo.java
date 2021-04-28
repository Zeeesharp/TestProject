package exceptionandling;

import javax.swing.plaf.synth.SynthLookAndFeel;

public class demo {

	
	public static void main(String[] args) {
		
		catching();
	
	}
	
	
	public static void catching() {
		
		
try {
			System.out.println("hello World");
			int i = 1/0;
			System.out.println("completed");
			
		}
		
	catch(Exception exp) {
		System.out.println("I am in the catch block");
		System.out.println("message is : "+ exp.getMessage());
		System.out.println("catch is : "+ exp.getCause());
		exp.printStackTrace();
		
	}
		finally {
			System.out.println("I am inside finally block");
			
		}
		
	}
	
}
