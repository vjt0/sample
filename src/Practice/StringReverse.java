package Practice;

public class StringReverse {
static int m=5;
	public static void main(String[] args) {
		String a="Viay";
		String b="Tomar";
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);

 System.out.println(m++);
 System.out.println(m);
 System.out.println(++m);
 System.out.println(++m+m++);
	}

}
