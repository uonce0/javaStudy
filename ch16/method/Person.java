package ch16.method;

public class Person {
	
	public void action(Calculable calculable) {
		System.out.println(calculable.calc(10, 4));
	}
}
