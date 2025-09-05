package ch16.calculable;

@FunctionalInterface
public interface Calculable {
	void calculate(int x, int y);
//	void m(); //-> functional interface 아님.
}
