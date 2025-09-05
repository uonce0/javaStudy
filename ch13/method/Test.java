package ch13.method;

public class Test {

	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100); //T가 Integer로 구체화(정해짐)
		System.out.println(box1.getT());
		
		Box<String> box2 = boxing("홍길동");
		System.out.println(box2.getT());
		
	}

	// 메소드에서 generic 사용 ( Box<T>를 리턴)
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.setT(t);
		return box;
	}
}
