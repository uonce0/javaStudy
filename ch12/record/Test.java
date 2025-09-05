package ch12.record;

public class Test {

	public static void main(String[] args) {
		// record
		Member m = new Member("abc", "홍길동", 20);
		System.out.println(m.id());
		System.out.println(m.name());
		System.out.println(m.age());
		System.out.println(m);
	}

}
