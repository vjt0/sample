package answers;

public class ReverseString {

	
	public String reversestr(String str) {

		String rev = "";
		int i=0;
		int len = str.length();
		System.out.println(len);
		for ( i=len-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		return rev;

	}
 StringBuffer    usingBuffser  (String str1)
 //Return type    Function name
 {
		StringBuffer sf=new StringBuffer(str1);
		return sf.reverse();

	}

	public static void main(String[] args) {

		ReverseString rs = new ReverseString();
		String res=rs.reversestr("hello");
		System.out.println(res);
		System.out.println(rs.usingBuffser("Vijay"));
		

	}

}
