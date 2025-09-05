package ch16.calculable;

public class Test2 {

	public static void main(String[] args) {
		// action 호출
		// #1. 구현 클래스 정의, 객체 전달
		action(new TotalPrice());
		
		// #2. 익명 객체 전달
		//	   익명 객체는 functional interface가 아닌 경우도 사용 가능
		action(new Buy() {

			@Override
			public void price(int a, int b) {
				System.out.println(a + b);
			}
		});
		
		// #3. lambda
		action( (x,y) -> System.out.println(x + y));
	}
	
	public static void action(Buy buy) {
		int a = 5000;
		int b = 1000;
		buy.price(a, b);
	}
	
	static class TotalPrice implements Buy {

		@Override
		public void price(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println(a + b);
		}
		
	}
}
