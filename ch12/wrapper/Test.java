package ch12.wrapper;

public class Test {

	public static void main(String[] args) {
		// Boxing
		Integer obj = 100;
		System.out.println(obj);
		
		// Unboxing
		int value = obj;
		System.out.println(value);
		
		//String -> int, Integer
		String str = "12345";
		int strInt = Integer.parseInt(str);
		Integer strInt2 = Integer.parseInt(str);
		System.out.println(strInt);
		System.out.println(strInt2);
		
//		String str3 = "12a45";
//		int strInt3 = Integer.parseInt(str3); //NumberFormatException
		
		// int -> String
		int num = 12345;
		String numStr = String.valueOf(num);
		System.out.println(numStr);
	}

}
