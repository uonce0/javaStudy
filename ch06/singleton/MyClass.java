package ch06.singleton;

public class MyClass {
	
	//외부에서 객체 선언이 안됨.
	//객체 없이 접근할 수 있어야 함. -> static
	private static MyClass instance = new MyClass();
	private MyClass() {}
	public static MyClass getInstance() {
		return instance;
	}
}
