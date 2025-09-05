package ch08.inter;

public class Airplane extends Transportation implements Fly{

	@Override
	public void howFast() {
		// 추상메소드의 구현체가 무조건 있어야됨!!!!
		System.out.println("500km!!");
		System.out.println(Fly.MAX_SPEED);
	}

}
