package chapter9;

/**
 * 引き算を行うクラスです。
 */
public class Sub implements CalculateBase {
	
	/**
	 * 2つの整数を引き算します。
	 * 
	 * @param x 1つ目の整数
	 * @param y 2つ目の整数
	 * @return 引き算の結果
	 */
	@Override
	public int calculate(int x, int y) {
		return x - y;
	}
}