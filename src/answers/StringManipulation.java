package answers;

public class StringManipulation {

	public static void main(String[] args) {
		String str="Mrs sunita is very happy end";
		System.out.println(str.indexOf('s', str.indexOf('s')+1));
System.out.println(str.indexOf('s', str.indexOf('s', str.indexOf('s')+1)+1));
	
	System.out.println(str.substring(str.indexOf("is"), str.indexOf("end")));
	
	
	String val="Hello_World_test_selenium";
	String testval[] =val.split("_");
	
	System.out.println(testval);
	
	}
	
	

}
