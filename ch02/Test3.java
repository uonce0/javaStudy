package ch02;

public class Test3 {

	public static void main(String[] args) {//하나의 중괄호 = scope
//		// 변수의 scope(유효 범위: 변수 사용 가능 범위)
//		int a = 10;
//		
//		if(a>10) {//scope.
////			int a = 20; //재선언 불가능.
//			int b = 20;
//			
//			if(b>10) {//scope.
//				System.out.println(a); //하위 scope에서는 상위의 것을 사용할 수 있다.
//				int c = 30;
//				System.out.println(c);
//			}
////			System.out.println(c); //상위 scope에서는 하위의 것을 사용할 수 없다. 유효 범위를 벗어남.
//		}
//		
////		System.out.println(b); //b 사용 불가. 알수 없음.
		
//		//print, println
//		int a = 10;
//		String b = "20";
//		
//		System.out.print(a);
//		System.out.print(b);
//		System.out.println(); // 개행문자만 출력.
//		System.out.println(a);
//		System.out.println(b);//내용 출력 후 개행(줄바꿈)
		
		//printf
		int num = 20;
		System.out.printf("%d   입니다.", num);
		System.out.println();
		int num2 = 200;
		System.out.printf("%d   입니다.", num2);
		System.out.println();
		
		int num3 = 200;
		System.out.printf("%-6d   입니다.", num3); //출력되는 문자열의 형식을 일정하게 출력. -붙이면 앞에서부터 채우기/양수로 입력 시 뒤에서부터 채우기.
		System.out.println();
		int num4 = 2000;
		System.out.printf("%-6d   입니다.", num4); //6칸을 사용한다는 의미.
		System.out.println();
		
		System.out.printf("%6d  %6d  입니다.", num3, num4);
	}
}