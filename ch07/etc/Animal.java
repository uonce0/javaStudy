package ch07.etc;

//객체 생성 불가능 클래스 - 추상 클래스
// 하위 클래스의 템플릿 역할
public abstract class Animal {
	String name;
	
	void m() {}
	
	abstract void m2(); //Animal 추상 클래스를 상속받으면 반드시 구현해야됨!!
}

class Bird extends Animal {

	@Override
	void m2() {
		System.out.println("Bird m2()");
	}
	
}

class Dog extends Animal {

	@Override
	void m2() {
		System.out.println("Dog m2()");
	}
	
}