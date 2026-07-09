package chapter9;

/**
 * 割り算を行うクラスです。
 */
public class Div implements CalculateBase {

	/**
	 * 2つの整数を割り算します。
	 * 
	 * @param x 1つ目の整数
	 * @param y 2つ目の整数
	 * @return 割り算の結果
	 */
	@Override
	public int calculate(int x, int y) {
		return x / y;
	}
}