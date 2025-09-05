package ch11.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test2 {
	
	public static void main(String[] args) {
		// RuntimeException - 쭉 타고 넘어옴
		// call history를 따른다.
		// try-catch 처리 된다.
		B b = new B();
		b.b2();
	}
}
