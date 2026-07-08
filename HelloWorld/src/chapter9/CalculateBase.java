package chapter9;

/**
 * 四則演算を行うためのインターフェイスです。
 */
public interface CalculateBase {
	
	/**
	 * 2つの整数を計算します。
	 * 
	 * @param x 1つ目の整数
	 * @param y 2つ目の整数
	 * @return 計算結果
	 */
	int calculate(int x, int y);
}