package ch06.encapsulation;

public class MyClass {
//	// Encapsulation 전
//	String name;
//	int age;
	
	// Encapsulation 후
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<10) {
			this.age= 20;
		} else {
			this.age = age;
		}
	}
}
