package ch11.user;

// 사용자 정의 Exception
public class InsufficientException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public InsufficientException(String message) {
		super(message);
	}
}
