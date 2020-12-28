package answers;

public class ReverseInteger {

	public static void main(String[] args) {
		long number =123456789;
		long reverse =0;
		while(number!=0)
		{
			reverse =reverse*10+number%10;
			number=number/10;
		}
System.out.println(reverse);
	}
}
