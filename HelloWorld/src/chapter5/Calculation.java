package chapter5;

/**
 * 計算値と演算子を管理するクラスです。
 */
public class Calculation {

	/**
	 * 1つ目の数値です。
	 */
	private int num1;
	
	/**
	 * 2つ目の数値です。
	 */
	private int num2;
	
	/**
	 * 計算で使用する演算子です。
	 */
	private String operator;

	/**
	 * 1つ目の数値を設定します。
	 * 
	 * @param num1 1つ目の数値
	 */
	public void setNum1(int num1) {
		this.num1 = num1;
	}

	/**
	 * 1つ目の数値を取得します。
	 * 
	 * @return 1つ目の数値
	 */
	public int getNum1() {
		return num1;
	}

	/**
	 * 2つ目の数値を設定します。
	 * 
	 * @param num2 2つ目の数値
	 */
	public void setNum2(int num2) {
		this.num2 = num2;
	}

	/**
	 * 2つ目の数値を取得します。
	 * 
	 * @return 2つ目の数値
	 */
	public int getNum2() {
		return num2;
	}

	/**
	 * 演算子を設定します。
	 * 
	 * @param operator 演算子
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * 演算子を取得します。
	 * 
	 * @return 演算子
	 */
	public String getOperator() {
		return operator;
	}
}