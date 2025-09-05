package ch13.multi;

public class Test {

	public static void main(String[] args) {
		// 여러 개의 type을 사용하는 generic
		Product<TV, String> p1 = new Product<>();
		p1.setKind(new TV());
		p1.setModel("스마트TV");
		
		Product<Car, String> p2 = new Product<>();
		p2.setKind(new Car());
		p2.setModel("SUV");
		
		System.out.println(p1.getKind());
		System.out.println(p2.getKind());
		System.out.println(p1.getModel());
		System.out.println(p2.getModel());
	}

}
