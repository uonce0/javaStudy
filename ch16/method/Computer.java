package ch16.method;

public class Computer {
	// static method
	public static double staticMethod(double x, double y) {
		return x + y;
	}
	
	// non-static method
	public double instanceMethod(double x, double y) {
		return x * y;
	}
}
