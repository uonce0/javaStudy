package ch07.access.a;

public class Test {

	public static void main(String[] args) {
		// private
//		Parent p = new Parent();
//		System.out.println(p.name); // 오류, 접근불가.

//		// default
//		Parent p = new Parent();
//		System.out.println(p.name); // 접근 가능.
		
		// protected
		Parent p = new Parent();
		System.out.println(p.name); // 접근 가능.
	}

}
