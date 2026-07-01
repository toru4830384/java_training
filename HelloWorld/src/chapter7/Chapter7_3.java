package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 入力された少数を医者五入して表示するプログラムです。
 */
 public class Chapter7_3 {
	
	/**
	 * 入力された少数を医者五入して表示します。
	 * 
	 * @param args プログラム起動時の引数
	 * @throws IOException キーボードからの入力処理に失敗した場合
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("小数点を含む数値を入力してください。");
		double value = Double.parseDouble(br.readLine());
		
		long result = Math.round(value);
		
		System.out.println("四捨五入した値は" + result + "です。");
	}
}