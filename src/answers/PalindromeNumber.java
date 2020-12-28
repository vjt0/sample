package answers;

public class PalindromeNumber {

	
public static void isPalindrome(int num)
{
	if(num<=9) {
		System.out.println("Invalid input");
		
	}
	
	else{int r=0;
	int reverse=0;
	int t;
	t=num;
	while(num>0) {
		r=num%10;
		reverse=reverse*10+r;
		num=num/10;
	}
	if(reverse==t) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}}}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 isPalindrome(5);isPalindrome(10);isPalindrome(121);isPalindrome(123454321);isPalindrome(-1);
	}

}
