package ch05;

public class Test5 {

	public static void main(String[] args) {
		// 참조 타입 배열
		String[] strArray = {"Hello", "Java"};
		String[] strArray2 = new String[2];
		strArray2[0] = "Hello";
		strArray2[1] = "Java";
		
		MyClass[] myClassArray = new MyClass[3];
		myClassArray[1] = new MyClass();
		
		System.out.println(myClassArray[1].myStrArray[1]);
	}
}

class MyClass {
	String[] myStrArray = { new String("abc"), new String("def") };
	
}

