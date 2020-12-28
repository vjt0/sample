package answers;

import java.util.ArrayList;

public class Lambda {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\52039252\\\\Desktop\\\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		ArrayList<String> list=new ArrayList();
         list.add("Vijay");
         list.add("Tomar");
         list.forEach((z)->{System.out.println(z);});
          String s=list.toString();
         System.out.println(s);
         char [] arr=s.toCharArray();
         System.out.println(arr.toString())
;        
	}
	

}
