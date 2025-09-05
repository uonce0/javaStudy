package ch08.inter.override;

public class A implements MyIf, MyIf2{ //상속 관계인 것을 다중 implement 하는 경우는 잘 없음. 보통은 서로 다른 성겨의 인터페이스를 참조.

	@Override
	public void m1() {
		System.out.println("A m1()");
		
	}

	@Override
	public void m2() {
		System.out.println("A m2()");
	}
	
	@Override
	public void m3() {
		System.out.println("A m3()");
	}
}

class B extends A {
	public void m3() {
		System.out.println("B m3()");
	}
	@Override
	public void m2() {
		System.out.println("B m2()");
	}
}

class C extends B {
	public void m4() {
		System.out.println("C m4()");
	}
	@Override
	public void m1() {
		System.out.println("C m1()");
	}
}
