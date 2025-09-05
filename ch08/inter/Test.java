package ch08.inter;

public class Test {

	public static void main(String[] args) {
		// 상속 관계
		Animal a = new Bird(); //부모
		Car c = new Car(); // 자신
		
		// 인터페이스 관계
		Fly f1 = new Bird();
		Fly f2 = new Airplane();
//		Fly f3 = new Car(); // 불가능. Fly 인터페이스 implements 하지 않은 클래스임.
		f1.howFast();
		f2.howFast();
		System.out.println(Fly.MAX_SPEED);
		System.out.println(f1.defaultSpeed());
		
	}

}
