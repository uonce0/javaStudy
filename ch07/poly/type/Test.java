package ch07.poly.type;

public class Test {

	public static void main(String[] args) {
		// 타입 다형성
		// #1 변수
//		A a = new A(); //좌, 우 같은 타입, 같은 객체
//		B b = new B();
		
//		A a = new B(); // 좌, 우 다른 타입, 다른 객체 (상속 관계에서 가능)
////		B b = new A(); // 오류, 왼쪽: 부모, 오른쪽: 자식 만 가능.
		
		// #2 파라미터
		// A의 모든 하위클래스는 다 m()에서 받을 수 있다.
		// 선언된 것 자기자신과 하위클래스를 받을 수 있다.
//		A a = new A();
//		m(a);
		
//		A a = new B(); m(a); // 가능
//		B b = new B(); m(b); // 가능
//		C c = new D(); m(c); // 가능
		
//		A a = new A(); m2(a); // 불가능
		C c = new C();
		m2(c); // 가능
		D d = new D();
		m2(d); // 가능
		
		// #3 리턴 타입
	}
	
	//#2 파라미터
	static void m(A a) {}
	static void m2(C c) {}
	
	// #3 리턴 타입
	// 상위 클래스는 하위 클래스를 반환 가능.
	static A m3() {
//		return new A(); // 가능
		return new B(); // 가능
	}
	
	// A(독립적)는 B가 될 수 없지만, C,D(B에 속함)는 B가 될 수 있다.
	static B m4() {
//		return new A(); // 불가능
//		return new B(); // 가능
//		return new C(); // 가능
		return new D(); // 가능
	}
}
