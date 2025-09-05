package ch16.basic;

public class UseMyFuncIF {
	void use(MyFuncIF myFuncIF) {
		// void m();
//		myFuncIF.m();
		
		//return이 있는 경우 - int m();
//		int ret = myFuncIF.m();
//		System.out.println(ret);
		
		// int m(int num
		int ret = myFuncIF.m(10);
		System.out.println(ret);
	}
}
