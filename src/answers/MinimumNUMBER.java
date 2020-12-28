package answers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class MinimumNUMBER {
	
	public static void find_vowel() {
		System.out.println("Enter the string");
		Scanner s =new Scanner(System.in);	
		String s1=s.nextLine();
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				System.out.println("Vowels present  "+s1.charAt(i) );
			}
		}
		}
	
	
	
	
	
	
	public static void absolute_diff() {
		System.out.println("Enter the numbers");
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int result= n-m;
		if(result<0) {
			result=result*-1;
		}
		System.out.println(result);
	}

	public static void main(String[] args) throws IOException {
		
	absolute_diff();
	find_vowel();

	}

}
