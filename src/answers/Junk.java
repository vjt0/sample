package answers;

public class Junk {
	
	public String remvjunk(String str) {
		str= str.replaceAll("[^a-zA-Z0-9]", "");
		//Using regular expression [a-zA-Z0-9]
		return str;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Junk js=new Junk();
System.out.println(js.remvjunk("Vijay@$^#&&#(*@TIB#^(#)#)#"));
	}

}
