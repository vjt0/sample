package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class DublicatString {

	public static void main(String[] args) {
		String [] s= {"Vijay","TOmar","Vijay"};
		String text="My name name is vijay vijay";
		String []s1=text.split(" ");
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(String trev:s1) {
			Integer count=m.get(trev);
			if(count==null) {
				m.put(trev, 1);
			}else {
				m.put(trev, ++count);
			}
		}Set<Entry<String,Integer>> display= m.entrySet();
		for(Entry<String,Integer>entry:display) {
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
		}
		

	}

}
