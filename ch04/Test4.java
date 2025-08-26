package ch04;

public class Test4 {

	public static void main(String[] args) {
		//break
//		{
//			int num = 5;
//			for (int i = 0;i<10;i++) {
////				if(i==num) break; // 0,1,2,3,4 출력
//				System.out.println(i);
//				if(i==num) break; // 0,1,2,3,4,5 출력
//			}
//		}

		//continue
//		{
//			int num = 5;
//			for (int i = 0;i<10;i++) {
//				if(i==num) continue; // 0,1,2,3,4, 6,7,8,9 출력. -5만 출력 안함.(스킵)
//				System.out.println(i);
////				if(i==num) continue; // 0,1,2,3,4,5,6,7,8,9 출력
//				// continue 밑에 아무것도 없으면 아무런 역할을 하지 못함. - 아무의미 없다.
//				
//			}
//		}
		
//		//nested break
//		for ( int i = 0; i<5;i++) {
//			for (int j = 0; j<5; j++) {
//				if(j==3) break;
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//label break
		Outer: for ( int i = 0; i<5;i++) {
			for (int j = 0; j<5; j++) {
				if(j==3) break Outer; //Outer까지 나감. 전체 for문 밖으로 나감. -> 권장하지 않음. 가독성 문제 등..
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
