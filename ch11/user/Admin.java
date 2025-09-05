package ch11.user;

public class Admin {

	public static void main(String[] args) {
		BookManager manager = new BookManager();
		try {
			manager.sell(200);
		}catch(InsufficientException e) {
			e.printStackTrace();
			//예외 처리
		}
		System.out.println(manager.stock);
	}

}
