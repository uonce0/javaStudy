package ch06.define;

// compiler가 자동으로 해주는 것.
//	1. java.lang 패키지를 import
//	2. 기본 생성자를 추가. (단, 아무런 생성자가 없을 때)

public class MyClass {
	//필드
	int num;
	char ch = 'A';
	String str;
	
	// has a 관계.
	MyClass2 mc2;
	
	//my own
	MyClass my;
	
	//method
	public int m() {
		return 20;
	}
	public int m2() {
		return this.num;
	}
	public int m3(String n) {
		return this.num + Integer.parseInt(n);
	}
	public void m4(String n) {
		System.out.println("n : " + n);
	}
	
	//생성자
	public MyClass() {
		System.out.println("기본 생성자");
	}
	// 생성자가 하나라도 있는 경우,
	// 기본 생성자를 만들어줘야 에러가 나지 않음. 자동 생성 X
	public MyClass(int num) {
		this.num = num;
	}
	
	// ide생성 : source ->generate constructor...
	public MyClass(int num, char ch, String str) {
		this.num = num;
		this.ch = ch;
		this.str = str;
	}
	
	// ide생성 : source ->generate toString()...
	public String toString() {
		return "MyClass [num=" + num + ", ch=" + ch + ", str=" + str + "]";
	}
	
	
}

////2개의 public class 생성 불가.
//public class MyClass2 {
//
//}
//아래와 같이 클래스 정의할 수 있으나 지양.
//// 그냥 class는 생성 가능.
//class MyClass2 {
//	
//}
