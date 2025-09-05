package ch18.serial;

import java.io.Serializable; //추상메소드가 없는 인터페이스

// 객체 직렬화 사용
public class MyClass implements Serializable { // 객체 직렬화 여부를 판단하는 일종의 표시

	private static final long serialVersionUID = 1L; //일종의 보안 확인 장치
	
	int n;
	transient int ssn;
	String str;
	
}
