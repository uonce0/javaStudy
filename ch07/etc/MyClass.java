package ch07.etc;

//final class
//public final class MyClass {
//	void m() {}
//}
//
//class SubClass extends MyClass { // 오류. 상속 불가.
//	
//}

public class MyClass {
	final void m() {}
}

class SubClass extends MyClass {
//	void m() {} // 오류. final 메소드는 재정의 불가.
}