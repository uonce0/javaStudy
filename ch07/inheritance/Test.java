package ch07.inheritance;

// Inheritance oop #2 - 상속
public class Test {
	
	public static void main(String[] args) {
//		//Parent만
//		Parent p = new Parent();
//		p.m();
////		p.price; //Parant에서는 Child에 접근 불가.
//		
//		// Child
//		Child c = new Child();
//		c.m(); // Child에 없지만 Parent에서 상속 받아서 호출.
//		c.name = "홍길동";
//		
//		c.price = 100;
//		c.m2();
		
		// 생성자
		Child c = new Child(10);
		
		//super
		c.m3();
		
		//super, this
		c.m4();
	}
}
