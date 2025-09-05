package ch08.inter;

// 모든 메소드는 public
// 모든 필드는 public static final -> 값을 지정해줘야함.
public interface Fly {
	int MAX_SPEED = 1000;
	void howFast(); //추상 메소드
	
	//default를 붙여주면 추상메소드가 아닌 온전한 메소드를 작성 가능.
	default int defaultSpeed() { 
		return 100;
	}
	
}
