package Practice;

public class Factorial {
	public static void factorial(int num) {
 		int sum=1;
		if(num==0||num==1||num==2) {
			System.out.println("Factorial is "+num);
		}
		else {
			for(int i=num;i>0;i--) {
				 sum=sum*i;
			}
			System.out.println("Factorial is "+sum);
		}
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          factorial(5);
	}

}
