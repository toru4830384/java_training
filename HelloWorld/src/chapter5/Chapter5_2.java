package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 数値と演算子を入力し、計算結果を表示するプログラムです。
 */
public class Chapter5_2 {

	/**
	 * 数値と演算子を入力し、計算結果を表示します。
	 * 
	 * @param args プログラム起動時の引数
	 * @throws IOException キーボードからの入力処理に失敗した場合
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("1つ目の数字を入力してください。");
		int num1 = Integer.parseInt(br.readLine());

		System.out.println("2つ目の数字を入力してください。");
		int num2 = Integer.parseInt(br.readLine());

		System.out.println("演算子を入力してください。");
		String operator = br.readLine();

		Calculation calculation = new Calculation();

		calculation.setNum1(num1);
		calculation.setNum2(num2);
		calculation.setOperator(operator);

		int result = 0;
		
		if (calculation.getOperator().equals("+")) {
			result = calculation.getNum1() + calculation.getNum2();
		} else if (calculation.getOperator().equals("-")) {
			result = calculation.getNum1() - calculation.getNum2();
		} else if (calculation.getOperator().equals("*")) {
			result = calculation.getNum1() * calculation.getNum2();
		} else if (calculation.getOperator().equals("/")) {
			result = calculation.getNum1() / calculation.getNum2();
		} else {
		    System.out.println("使用できる演算子は + - * / のみです。");
		    return;
		}
		
		System.out.println("計算結果：" + result);
	}
}