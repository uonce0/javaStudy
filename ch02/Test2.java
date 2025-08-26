package ch02;

public class Test2 {

	public static void main(String[] args) {
		//byte, int 형변환
		byte b1 = 10;
		byte b2 = 20;
//		byte b3 = b1 + b2; //byte끼리 산술 연산이지만, 연산 과정에서 int로 형 변환.
		int b3 = b1 + b2;
		byte b4 = (byte)(b1 + b2);
		System.out.println(b3);
		System.out.println(b4);
		
		byte b5 = (byte)123456789; //=21. data loss
		System.out.println(b5);
		
		//String - 기본 타입이 아니다! 참조 타입이다.
		String hello = "Hello!"; // final class : 더 이상 상속 불가능하다.
		System.out.println(hello); //reference type(참조형)
		
		//String -> int
		String str = "123";
		String str2 = "456";
		int num = Integer.parseInt(str);
		int num2 = Integer.parseInt(str2);
		
		System.out.println(num + num2);
		System.out.println(str + str2);
		
		String str3 = String.valueOf(num + num2);
		System.out.println(str3);
		
	}
}
