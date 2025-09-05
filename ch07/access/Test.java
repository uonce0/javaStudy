package ch07.access;

import ch07.access.a.Parent;

public class Test {

	public static void main(String[] args) {
		// public
		// 객체 생성 후 모든 곳에서 접근 가능.
//		Parent p = new Parent();
//		System.out.println(p.name);
		
		//private
//		Parent p = new Parent();
//		System.out.println(p.name); // 에러 발생. 접근 불가.
		
		// default
//		Parent p = new Parent();
//		System.out.println(p.name); // 에러 발생. 접근 불가.
	
		// protected
		Parent p = new Parent();
//		System.out.println(p.name); // 에러 발생. 접근 불가.
	}
}
