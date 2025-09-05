package ch09;

public class Car {
	//필드
	Tire tire1 = new Tire(); //has a 관계
	Tire tire2 = new Tire() { //하위 클래스의 객체를 클래스 이름 없이.
		@Override
		public void roll() {
			System.out.println("익명 자식 타이어가 굴러간다.");
		}
	}; //원래 메소드와 여기서만 다르게 작성하고 싶다. 여러번 사용할 것도 아닌데 새로 만들긴 좀 그런데;; -> 여기서만 쓸 것을 만들어야겠다. -> 익명 객체
	
	public void run() {
		// 메소드
		new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 타이어 2 가 굴러간다.");
			}
		}.roll(); //재정의
		
		// 변수 선언 - 할당 생략
		//Tire temp = new Tire(); temp.roll();
		new Tire() {
		}.roll(); //단순 축약. 원래 메소드 쓸건데 함수에서 호출해줘라.
	}
}
