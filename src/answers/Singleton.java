package answers;

public class Singleton {

	//For a Singleton class the constructor should be private .
	//Their should be a static method that will return object of this class .
	
	private static Singleton singleton_instance=null;
	  String str;
	private Singleton() {
		str="hey i am Vijay";
		
	}
	public static Singleton Run() //(Lazy Initialization )
	{
		if(singleton_instance == null) {
			singleton_instance=new Singleton();
		}
		return singleton_instance;
	}
	
	public static void main(String[] args) {
	Singleton x=Singleton.Run();
	Singleton y=Singleton.Run();
	Singleton z=Singleton.Run();
	x.str=x.str.toUpperCase();
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
    
	
	 
	z.str= z.str.toLowerCase();
	System.out.println(x.str);
	System.out.println(y.str);
	System.out.println(z.str);
	
	
	
	}

}
