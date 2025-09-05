package ch13.inter;

public class CarAgency implements Rentable<Car> {

	@Override
	public Car rent() {
		return new Car();
	}

	
	
}
