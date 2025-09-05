package ch07.etc;

public class Test2 {

	public static void main(String[] args) {
		//추상 클래스
//		Animal a  new Animal(); // 오류. 추상 클래스는 객체 생성 불가.
		
		Bird b = new Bird();
		System.out.println(b.name); //필드 접근 가능.
		b.m(); //일반 메소드 접근 가능.
		
		// overriding
		Animal bird = new Bird();
		bird.m2();
		Animal dog = new Dog();
		dog.m2();
		
	}
}
