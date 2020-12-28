package answers;

public class ContainsNumber {
	public static void containsDigit(String str) {
		str=str.replaceAll("[^0-9]", "");
		System.out.println("Digits in the String are " +str);
		if(str.isBlank()) {
			System.out.println("No digits");
		}else {
			System.out.println("Contains digits");
		}
		
			
		}@SuppressWarnings("finally")
		public static int hello() {
			try {return 0;}
			finally {
				return 1;
			}}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//containsDigit("Vijay Tomar12345");
		//containsDigit("");
		System.out.println(hello());

	}

}
