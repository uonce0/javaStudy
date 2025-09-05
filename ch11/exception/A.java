package ch11.exception;

import java.io.IOException;

public class A {
	void a() throws IOException{
		B b = new B();
		b.b();
	}
}

class B {
	void b() throws IOException {
		C c = new C();
		try {
			c.c();
		} catch(IOException e) {
			e.printStackTrace(); // log에 찍힘.
			//예외처리
			throw new IOException();
		}
	}
	
	void b2() {
		C c = new C();
		c.c2();
	}
}

class C {
	void c() throws IOException {
		D d = new D();
//		try {
//			d.d();
//		} catch(IOException e) {
//			//예외처리
//		}
		
		d.d();
	}
	void c2() {
		D d = new D();
		try {
			d.d2();
		}catch(NullPointerException e) {
			//예외처리
		}
		
	}
}

class D {
	void d() throws IOException {}
	void d2() {
		String str = null;
		str.length();
	}
}