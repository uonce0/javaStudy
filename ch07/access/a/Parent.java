package ch07.access.a;

public class Parent {
	// public - 모든 곳에서 접근 가능.
//	public String name = "부모";
	
	//private - 오직 같은 클래스 내에서만 접근 가능.
//	private String name = "부모";
	
	// default - 같은 패키지 내에서만 접근 가능.
//	String name = "부모";
	
	// protected - 같은 패키지, 상속 관계에서 접근 가능.
	protected String name = "부모";
}
