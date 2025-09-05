package ch13.container;

public class Test {

	public static void main(String[] args) {
		
		// Object를 사용
//		Container container = new Container();
//		// String
//		container.element = new String("abc");
//		
//		Container container2 = new Container();
//		// Integer
//		container2.element = 15;
//		
////		String str = container.element; //불가능. 타입이 안맞음.
//		String str = (String) container.element; //형변환 필수.
		
		//Generic
		Container<String> container = new Container<>();
		container.element = new String("abc");
		
		Container<Integer> container2 = new Container<>();
		container2.element = 15;
		
		String str = container.element; // 형변환 없이 바로 담을 수 있음.
		Integer num = container2.element;
		
	}

}
