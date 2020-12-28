package answers;

public class random {
	public static boolean isprime(int num) {
		if (num==1||num==0) {
			return false;
		}
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void fib(int num) {
		int a=0;int b=1;int c;
		System.out.print(a+" "+b);
		for(int i=2;i<=num;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.print( "  "+c);}
	}

	public static void main(String[] args) {
		fib(10);
		for(int i=1;i<100;i++) {
			if(isprime(i)==true) {
				System.out.print(i+" ");
			}
		}
		// TODO Auto-generated method stub
String s="kjshtsuythjbdkdaj";
      s=s.concat("  Vijay");
      String z="kjshtsuythjbdkdaj";
      System.out.println(s);
      System.out.println(z);
      System.out.println (s.indexOf('j', s.indexOf('j')+1));
      System.out.println (s.indexOf('j' ,s.indexOf('j', s.indexOf('j')+1)+1));
      System.out.println(s.substring(2, 6));
      for(int i=1;i<=5;i++) {
    	  for(int j=1;j<=i;j++) {
    		  System.out.print("*"+" ");
    	  }
    	  System.out.println();
      }
	}

}
