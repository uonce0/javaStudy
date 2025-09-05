package ch07.object;

public class Test {

	public static void main(String[] args) {
		// Object Class
		Person p1 = new Person();
		Person p2 = new Person();
		
		//객체 비교
		// ==
		System.out.println(p1 == p2); //주소값 비교 : false
		// equals() <= 재정의하지 않으면 Object.equals() 사용
		// Object.equals() 코드는 == 비교
		//그냥 쓰면 주소값 비교 : false
		System.out.println(p1.equals(p2)); 
		
		//ssn 값 부여
		p1.ssn = 10;
		p2.ssn = 20; //10, 20 으로 변경해본다.
		System.out.println(p1.equals(p2));
		
		//Java API - Set, List, Map, ...
		//객체 비교 hashCode()
		
		//toString
		System.out.println(p1);
	}

}
