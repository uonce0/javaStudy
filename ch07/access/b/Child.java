package ch07.access.b;

import ch07.access.a.Parent;

public class Child extends Parent{
	
	//private
//	public void m() {
//		System.out.println(super.name); // 오류, 상속 관계에서도 접근 불가.
//	}
	
	// default
//	public void m() {
//		System.out.println(super.name); // 오류, 상속 관계에서도 접근 불가.
	
	// protected
	public void m() {
		System.out.println(super.name); // 접근 가능.
	}
}
