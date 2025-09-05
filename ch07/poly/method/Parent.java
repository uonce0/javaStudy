package ch07.poly.method;

// method overloading은 생략
// 재정의 할 때, @Override 을 사용 
public class Parent {
	void m() {System.out.println("Parent m()");}
	void m2(int i) {System.out.println("Parent m2(int i)");}
	
	void m(int n) {} // overloading 예시
}

class Child extends Parent {
	@Override
	void m() {System.out.println("Child m()");}
	void m2() {System.out.println("Child m2()");}
	
}