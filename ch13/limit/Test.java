package ch13.limit;

public class Test {

	public static void main(String[] args) {
		System.out.println(compare(10,20)); //Integer 2개
//		System.out.println(compare("Hello", "World")); //String 2개

		System.out.println(compare(20,20)); //Integer 2개
	}
	
//	public static <T> boolean compare(T t1, T t2) {
//		System.out.println(t1.getClass().getSimpleName());
//		System.out.println(t2.getClass().getSimpleName());
//		
//		return t1 == t2;
	
	//메소드가 가지고 있는 T에 직접 제한을 가하는 것.
	// T에 제한을 가하면서 (구체화) Number 타입의 메소드 호출 가능
	public static <T extends Number> boolean compare(T t1, T t2) {
		System.out.println(t1.getClass().getSimpleName());
		System.out.println(t2.getClass().getSimpleName());
		
//		return t1 == t2;
		return t1.intValue() == t2.intValue(); // Number에 선언된 메소드 호출
		

	}
}
