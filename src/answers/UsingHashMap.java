package answers;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UsingHashMap {

	public static void main(String[] args) {
		String names[]= {"Vijay","Tomar","Vijay","Bhumika","Kirti","Kirti"};
		Map<String,Integer> store =new HashMap<String,Integer>();
		
		for(String name:names) {
			Integer count =store.get(name);
			if(count==null)
			{
				store.put(name,	1);
				
			}
			else {store.put(name, ++count);}
		}

		Set<Entry<String,Integer>> display= store.entrySet();
		for(Entry<String,Integer>entry:display) {
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
		}
	}

}
