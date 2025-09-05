package ch06.encapsulation;

// Encapsulation oop #1 - 캡슐화
//setter, getter 를 통해 객체 자신의 로직을 스스로 구현할 수 있다. 외부에 대한 직접 제어 불가능

//setter, getter 가 없는 경우, 객체 내부의 변화는 객체를 사용하는 외부코드 책임을 진다. 
//=> 외부에서 수정을 알아서 해야 한다.
//setter, getter 를 사용한 경우, 객체 내부의 변화는 객체 내부에서 수정하면 된다.
//=> 외부는 영향을 받지 않는다.
public class Test {
	
	
	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
//		//Encapsulation 후
//		//set
//		mc.name = "홍길동";
//		mc.age = 20;
//		mc.age = -10;
//		
//		//get
//		System.out.println(mc.name);
//		System.out.println(mc.age);
		
		//Encapsulation 후
		//set
		mc.setName("홍길동");
		mc.setAge(20);
		mc.setAge(-10);
		
		// get
		System.out.println(mc.getName());
		System.out.println(mc.getAge());
	}
}
