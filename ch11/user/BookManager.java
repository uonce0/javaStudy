package ch11.user;

public class BookManager {
	int stock = 100;
	
	public void sell(int amount) throws InsufficientException {
		if(stock < amount) {
//			System.out.println("재고 부족");
			throw new InsufficientException("재고 부족 예외");
		}
		this.stock-=amount;
	}
}
