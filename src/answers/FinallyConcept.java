package answers;

public class FinallyConcept {

	public static void main(String[] args) {
		//test();
		division();

	}
	
	
	public static void test() {
		try {
			System.out.println("Inside try block");
			throw new RuntimeException("Test");
		}
		catch (Exception e) {
			System.out.println("inside Catch block");
		}
		finally {//it will always executed after try catch block no matter exception is coming or not
			System.out.println("inside Finally block");
		}
	}
	public static void division() {
		int i=10;
		try {
			int k=i/0;
		}
		catch(NullPointerException e) {}//this bad exception handling coz the exception thrown is arithmetic and we are catching it 
		                                   //NullPointerException  so it will not enter inside catch block 
		{System.out.println("Execute this any way");}
	}

}
