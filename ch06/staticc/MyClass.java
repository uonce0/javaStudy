package ch06.staticc;

public class MyClass {
	
	//MyClass 클래스가 메모리에 로드될 때 실행.
	static {
		System.out.println("MyClass static{}");
	}
	
	public MyClass() {
		System.out.println("MyClass constructor()");
	}
	int num = 10;
	//static : 객체 없이 사용할 수 있다.
	static int MY_NUM = 20;
	
	public int getNum() {
		return this.num;
	}
	
	public static int addNum(int n1, int n2) {
//		System.out.println(this.num); // 에러 발생. 객체 접근 불가능.
		return n1 + n2;
	}
}
