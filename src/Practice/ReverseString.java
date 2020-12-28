package Practice;

public class ReverseString {

	
	public static StringBuffer reverse(String s) {
		StringBuffer sf=new StringBuffer(s);
		return(sf.reverse());
	}
	public static void main(String[] args) {
		
		StringBuffer s1=ReverseString.reverse("Its done");
		String s="Vijay Tomar";
		String s3 =null;
		String sterev="";
		for(int i =s.length()-1;i>=0;i--) {
			sterev=sterev+s.charAt(i);
			}
System.out.println("Reverse String is "+sterev);
System.out.println("Reverse String is "+s1);

	}

}
