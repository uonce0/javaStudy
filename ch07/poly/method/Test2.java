package ch07.poly.method;

public class Test2 {

	public static void main(String[] args) {
		// 메소드 오버라이딩
		{
			A a = new B();
			a.a(); //A-a()
		}
		{
			B b = new C();
			b.a(); //C-a()
		}
		{
			B b = new D();
			b.a(); // C-a()
			b.a(1); //D-a(int i)
		}
		{
			C c = new D();
			c.b(); //D-b()
			
		}
	}
}
