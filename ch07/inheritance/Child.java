package ch07.inheritance;

public class Child extends Parent{
	int price;
	
	void m2() {
		System.out.println("Child m2()");
	}
	
	//기본 생성자 없음.
	// 자식 클래스 생성자에서 부모 클래스의 생성자를 명시적으로 호출하지 않으면
	// 컴파일러가 부모 클래스의 기본 생성자 super()를 묵시적으로 추가.
	
	//명시적으로 호출을 하면 컴파일러가 자동적으로 추가해주지 않음
	// -> 개발자가 직접 추가해줘야됨.
	Child(int price) {
//		super(10); //억지. 자식이 부모를 결정하는 일은 없어야함.
//		super();
		this.price = price;
	}
	
	void m3() {
		//super. 부모 필드, 메소드
//		System.out.println(super.name);
//		super.m();
		
		//this. 자신 필드, 메소드
		//단, 자신의 필드, 메소드가 없고 동일한 이름의 상속된 필드, 메소드가 존재할 경우
		//그것을 사용.
		System.out.println(super.name);
		this.m();
	}
	
	String name2 = "자식";
	
	void m4() {
		System.out.println(super.name2);
		System.out.println(this.name2);
	}
}
