package ch07.etc;

public class Test {

	public static void main(String[] args) {
		// 강제 형 변환
//		A a = m(); //A 제한된 접근. A 클래스에 있는 것만 사용 가능.
//		C c = (C) m(); //C 강제 형 변환
//		C c2 = (C) m(); //B 객체를 강제 형 변환할 경우. ClassCastException 발생.
		
		//instanceof
//		A a = m();
//		if( a instanceof B) {
//			B b = (B) a; //확인 후 형변환
//		}
		
		// instanceof <= type 다형성
		A a = m();
		
		// 아래와 같은 코든느 모두 a instanceof B ==true 가 된다.
//		if ( a instanceof B) {
//	
//		}else if(a instanceof C) {
//			
//		}else if(a instanceof D) {
//			
//		}
		
		//하위클래스부터
		if ( a instanceof D) {
			
		}else if(a instanceof C) {
			
		}else if(a instanceof B) {
			
		}
	}

	public static A m() {
//		return new C();
//		return new B();
		return new D();
	}
}
