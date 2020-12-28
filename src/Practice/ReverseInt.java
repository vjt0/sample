package Practice;

public class ReverseInt {

	public static void main(String[] args) {
		int num =23456789;
		int arry[]=new int[2];
		arry=new int[3];
		int reverse=0;
		for(int i =1;i<=8;i++) {
			reverse=reverse*10+num%10;
			num=num/10;
		}
		System.out.println("the reverse integer is "+reverse);

	}

}
