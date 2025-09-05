package ch08.inter.override;

public class Test {

	//Test와 A는 인터페이스를 이해하고 있다는 전제하에 작동.
	// => 인터페이스를 통해서 기능한다.
	public static void main(String[] args) {
		// 인터페이스 상속 -> 상속 관계에서와 동일하게 적용.
		MyIf myIf = new A();
		MyIf myIf2 = new B();
		MyIf myIf3 = new C();
		
		myIf.m1();
		myIf2.m1();
//		myIf2.m3(); //접근 불가. 인터페이스가 m1(),m2() 메소드로만 정의되어 있음.
		myIf2.m2(); //오버라이딩
		myIf3.m1(); //오버라이딩
		
		MyIf2 myIf4 = new A();
		myIf4.m3();
//		myIf.m3(); //불가능
		
		//사용자 측면에서는 구현체가 뭐가 됐든,
		//인터페이스에 선언된 내용만 알면 됨.
	}

}

//상속 부모? 인터페이스? -> 기능적인 관점에서는 인터페이스 활용!
// -> 내부 구현에 관심 가질 필요 없이 그냥 기능을 가져다 사용하면 된다. 
