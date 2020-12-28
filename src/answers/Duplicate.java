package answers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
 String str []= {"Vijay","Bhumika","Vijay"};
 System.out.println("Enter the string");
 
 
		Set<String> set=new HashSet<String>();
		for(String st:str) {
			if(set.add(st)==false) {
				System.out.println("Duplicate is "+st);
			}
		}
	
	}

}
