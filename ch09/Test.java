package ch09;

public class Test {

	public static void main(String[] args) {
		Car car = new Car();
		car.tire1.roll();
		car.tire2.roll();
		car.run();
		
		// Fly interface 객체 생성, 전달
		// Fly implements 클래스를 생성 필요
		// 인터페이스를 구현한 클래스의 객체를 익명으로 만들어서 전달
		// 더 많이 사용됨.
		m(new Fly() {
			@Override
			public void howFast() {
				System.out.println("100km");
			}
		});
	}
	
	public static void m(Fly fly) {
		fly.howFast();
	}
}
