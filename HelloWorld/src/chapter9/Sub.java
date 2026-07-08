package chapter9;

public class Sub implements CalculateBase {
	
	@Override
	public int calculate(int x, int y) {
		return x - y;
	}
}