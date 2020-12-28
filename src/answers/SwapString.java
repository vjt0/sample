package answers;

public class SwapString {

	public static void main(String[] args) {
		String a ="Hello";
		String b ="World";
		
		//Step 1 append both the strings
		a=a+b;
		System.out.println(a);
		//Step 2 get the b value from the a 
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swapping a="+a + " b= " +b);

	}

}
