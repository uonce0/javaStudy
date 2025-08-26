package ch02;

public class Test {

	// 숫자, 정수의 기본 타입은 int이다.
	// = 오른쪽에 오는 숫자는 기본적으로 int로 인식.
	public static void main(String[] args) {
/*
		//byte(1byte) : int -> byte 자동 형 변환을 해서 값을 넣는 것.
		byte var1 = -128;
		byte var2 = -30;
//		byte var3 = 128;
		
		//short(2byte)
//		short var4 = 111111; 2byte 초과함으로 불가.
		short var4 = 1111;
		short var5 = var1; //byte -> short *자동 형 변환
//		byte var6 = var4;
		
		//int, long
		int var7 = 100;
//		int var8 = 11111111111; //형변환 필요 없음: int로 사용하기에는 너무 길다.
		long var9 = 11111111111L;
		
		// char
		char c1 = 'A';
		char c2 = 66;
		int c3 = 67;
		char c4 = c3; //error. 이미 int로 확정됐기 때문에 char로 사용 안됨.
		System.out.println(c1);
		System.out.println(c2);
*/		
		
		//float
//		float var1 = 0.123456789234f; //f 붙여서 명시해줘야됨. 9 이후 출력 안됨.
//		double var2 = 0.12345678912345678; //전체 출력됨.
//		System.out.println(var1);
//		System.out.println(var2);
//		
		System.out.println(10/3); //=3
		
		double var3 = 10/3;
		System.out.println(var3); //=3.0 자바에서는 소숫점 날려버림. 기본 정수 타입이 int이기 때문에!!
		//javascript에서는 기본이 double이어서 소숫점까지 나옴. 3.33333...이렇게.
		
		double test1 = 10;
		double test2 = 3;
		System.out.println(test1/test2);
		
		//BigDecimal, BigInt 등 자료형 사용 -> 소숫점을 다루는 목적의 프로그램에 자바는 적절하지 않다.
		
		//boolean
		boolean var4 = false; //false 대신 0 사용 이런거 자바는 안됨.
		boolean var5 = true;
		
		boolean var6 = m();
		System.out.println(var6);
		
		if(var6) {
			System.out.println("여기");
		}
	}
	
	public static boolean m() {
		//코드 수행
//		return true;
		return ( 1 != 0 );
	}
}
