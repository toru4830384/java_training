package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 入力された文字列の空白を省いて表示するプログラムです。
 */
 public class Chapter7_2 {
	
	/**
	 * 入力された文字列の空白を省いて表示します。
	 * 
	 * @param args プログラム起動時の引数
	 * @throws IOException キーボードからの入力処理に失敗した場合
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("空白を含めた文字を入力してください。");
		String text = br.readLine();
		
		String result = text.replace(" ", "");
		
		System.out.println("空白を省いた文字は「" + result + "」です。");
	}
}