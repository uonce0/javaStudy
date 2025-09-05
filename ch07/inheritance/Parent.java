package ch07.inheritance;

public class Parent {
	String name;
	int num;
	
	void m() {
		System.out.println("Parent m()");
	}
	
	// 부모 클래스에서는 기본생성자를 항상 추가해주는 것이 좋음.
	// 자식 클래스에서 오류가 나는 것을 방지하기 위해.
	Parent() {}
	Parent(int num) {
		this.num = num;
	}
	
	String name2 = "부모";
}
