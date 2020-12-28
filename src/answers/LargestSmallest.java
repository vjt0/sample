package answers;

import java.util.Arrays;

public class LargestSmallest {

	public static void main(String[] args) {
		int num[] = {-10,20,15,-44,232323232};
		int large=num[0];
		int small= num[0];
		for(int i =1;i<num.length;i++) {
			if(num[i]>large) {
				large=num[i];
			}
			else if(num[i]<small) {
				small=num[i];
			}
		}
		System.out.println("Array is "+ Arrays.toString(num));
		System.out.println("Largest is"+ large+"and Smallest is"+small);

	}

}
