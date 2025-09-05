package ch16.calculable;

public class Test {

	public static void main(String[] args) {
		// action 호출
		// #1. 구현 클래스 정의, 객체 전달
		action(new MyCalculable());
		action(new MyCalculable2());
		
		// #2. 익명 객체 전달
		//	   익명 객체는 functional interface가 아닌 경우도 사용 가능
		action(new Calculable() {
			@Override
			public void calculate(int x, int y) {
				System.out.println(x + y);
			}
		});
		action(new Calculable() {
			@Override
			public void calculate(int x, int y) {
				System.out.println(x - y);
			}
		});
		
		// #3. lambda
		action( (x,y) -> System.out.println(x+y));
		action( (x,y) -> System.out.println(x-y));
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 20;
		calculable.calculate(x, y);
	}
	
	static class MyCalculable implements Calculable {

		@Override
		public void calculate(int x, int y) {
			System.out.println(x + y);
		}
		
	}
	static class MyCalculable2 implements Calculable {

		@Override
		public void calculate(int x, int y) {
			System.out.println(x - y);
		}
		
	}
}
