package chapter9;

/**
 * 足し算を行うクラスです。
 */
public class Add implements CalculateBase {
	
	/**
	 * 2つの整数を足し算します。
	 * 
	 * @param x 1つ目の整数
	 * @param y 2つ目の整数
	 * @return 足し算の結果
	 */
	@Override
	public int calculate(int x, int y) {
		return x + y;
	}
}