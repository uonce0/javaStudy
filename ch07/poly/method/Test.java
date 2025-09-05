package ch07.poly.method;

public class Test {

	public static void main(String[] args) {
		// 메소드 오버라이딩
//		Parent p = new Parent();
//		p.m();
//		p.m2(0);
//		
//		Child c = new Child();
//		c.m(); // 상속 - 재정의
//		c.m2();
//		c.m2(0); //상속
		
		// 타입을 달리
		// 객체 생성(변수, 메소드 선언)은 오른쪽, 실제로 수행되는 메소드는 왼쪽을 따라간다..
		Parent p = new Child();
		p.m(); //Child의 재정의된 m() 호출. 
//		p.m2(); // 불가능 -> 왜?
	}

}
