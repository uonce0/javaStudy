package ch06.define;

public class Test2 {
	public static void main(String[] args) {
		//객체 생성 & 메소드 호출
		MyClass mc = new MyClass();
		int ret = mc.m();
		System.out.println(ret);
		
		mc.num = 100;
		System.out.println(mc.m2());
		
		String n = "200";
		System.out.println(mc.m3(n));
		
		mc.m4("123");
		
		// 생성자
		MyClass mc2 = new MyClass();
		MyClass mc3 = new MyClass(5);
		
		System.out.println(mc3.num);
		
		MyClass mc4 =new MyClass(7, 'B', "Hello");
		System.out.println(mc4.toString());
	}
}
