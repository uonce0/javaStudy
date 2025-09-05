package ch16.method;

public class Test {

	public static void main(String[] args) {
		// 메소드 참조
		Person p = new Person();
		
		//lambda
		p.action((x,y)-> Computer.staticMethod(x, y));
		
		//method reference
		p.action( Computer::staticMethod );

		// non-static method 부를 시
		Computer com = new Computer();
		
		//lambda
		p.action((x,y)-> com.instanceMethod(x, y));
		
		//method reference
		p.action( com::instanceMethod );
	}

}
