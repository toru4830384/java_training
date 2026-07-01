package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * カンマ区切りの文字列を分割して表示するプログラムです。
 */
 public class Chapter7_4 {
	
	/**
	 * カンマ区切りの文字列を入力し、
	 * 分割した文字列を1つずつ表示します。
	 * 
	 * @param args プログラム起動時の引数
	 * @throws IOException キーボードからの入力処理に失敗した場合
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("カンマ区切りの文字列を入力してください。");
		String fruits = br.readLine();
		
		String[] fruitArray = fruits.split("[,、]");
		
		System.out.println("くだものを表示します。");
		
		for (String fruit : fruitArray) {
			System.out.println(fruit);
		}
	}
}