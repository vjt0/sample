package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterating {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i =1;i<10;i++) {
			list.add(i);
		}
		System.out.println("----------Using Lambda and for each loop");
		list.forEach((n)->{System.out.print(n+" ");});
		System.out.println("----------Using Iterator");
		Iterator<Integer>it=list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		
		for(int show:list) {
			System.out.println(show);
		}

	}

}
