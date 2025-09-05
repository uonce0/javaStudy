package ch16.basic;

public class Test {

	public static void main(String[] args) {
		UseMyFuncIF useMyFuncIF = new UseMyFuncIF();
//		useMyFuncIF.use( () -> System.out.println("void m()"));

//		useMyFuncIF.use( () -> {
//			System.out.println("int m()");
//			return 1;
//		});
//		useMyFuncIF.use( () -> 10+20 );
		
		useMyFuncIF.use((n) -> n+20); //m(int num) 오버라이딩 -> 이후 use() 메소드 실행.
		useMyFuncIF.use(n -> n+20);
	}

}
