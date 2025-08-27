package ch06.define;

public class Test {
	public static void main(String[] args) {
		//객체 생성
		MyClass mc = new MyClass();
		
		//필드 접근
		mc.num = 10;
		mc.str = "Hello";
		
		System.out.println(mc.num);
		System.out.println(mc.ch);
		System.out.println(mc.str);
		System.out.println(mc.mc2);
		
		mc.mc2 = new MyClass2();
		System.out.println(mc.mc2);
		
		mc.my = new MyClass();
		System.out.println(mc.my);
		System.out.println(mc);
	}
}
