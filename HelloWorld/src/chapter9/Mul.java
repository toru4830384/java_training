package chapter9;

/**
 * 掛け算を行うクラスです。
 */
public class Mul implements CalculateBase {
	
	/**
	 * 2つの整数を掛け算します。
	 * 
	 * @param x 1つ目の整数
	 * @param y 2つ目の整数
	 * @return 掛け算の結果
	 */
	@Override
	public int calculate(int x, int y) {
		return x * y;
	}
}