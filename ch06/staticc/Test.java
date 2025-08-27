package ch06.staticc;

public class Test {
	
	//Test 클래스가 메모리에 로드될 때 실행.
	static {
		System.out.println("Test static{}");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main()");
		
		//static
		MyClass mc = new MyClass(); //객체 생성
		System.out.println(mc.num);
		
		System.out.println(MyClass.MY_NUM); //객체 X, 클래스.
		
		//Integer
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//static method
		System.out.println(mc.getNum());
		System.out.println(MyClass.addNum(1, 2));
		
		// object vs static
		System.out.println(mc.MY_NUM); // 경고 but 에러 X. 가능은 하다.
//		System.out.println(MyClass.num); //불가능. 에러 O
		
		
	}
}
