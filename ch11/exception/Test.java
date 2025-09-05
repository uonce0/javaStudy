package ch11.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		//Error
//		m(); // StackOverflowError
		
		// UncheckedException
//		String str = null;
//		str.length(); // NullPointerException
		
		// 컴파일러가 컴파일 타임에서는 확인 불가.
		String str = getStr();
		str.length(); // NullPointerException
		
		//CheckedException
		//파일 읽고 쓰기
//		FileReader fr = new FileReader("a.txt");
		
//		// 예외 처리의 2가지 방법
//		// #1. 내가 알아서 (여기서 끝! / 여기서 처리1, 나머지는 위에서)
//		try {
//			m2();
//		} catch(IOException e) {
//			//예외 처리
//			throw new 예외(); //나머지는 위에서 
//		} finally {
//			//항상 수행
//		}
		
		// #2. 나도 몰라 위에서 하겠지
		m2();
		//예외 처리는 정해진 규칙에 따라 진행한다.
	}
	
	public static void m() {
		m();
	}
	
	public static String getStr() {
//		return "hello";
		return null;
	}
	
	public static void m2() throws IOException {
		// IO (input, output)
		// 파일 X -> 예외 발생 throw new IOException();
	}
}
