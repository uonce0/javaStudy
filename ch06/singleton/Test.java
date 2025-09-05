package ch06.singleton;

//싱글턴
public class Test {
	
	public static void main(String[] args) {
		//싱글턴 패턴 적용 전
//		MyClass mc1 = new MyClass();
//		MyClass mc2 = new MyClass();
//		
//		System.out.println(mc1 == mc2);
		
		// jvm 내에서 단 한개의 객체만 만들어져야 하는 경우
		// 주로 resource 등 중요 자원 관련.
		// 디자인 패턴 적용해서 구현.
		
		//싱글턴 패턴 적용 후
		MyClass mc1 = MyClass.getInstance();
		MyClass mc2 = MyClass.getInstance();
		
		System.out.println(mc1 == mc2);
	}

}
