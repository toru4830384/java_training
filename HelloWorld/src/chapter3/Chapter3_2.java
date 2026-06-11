package chapter3; 	

import java.io.*;
/**
 * 入力した2つの整数に当てはまる条件を判定するプログラムです。
 */
 public class Chapter3_2 {											
	  /**
	   * xとyに入力した整数値に当てはまる条件を表示します。
	   * 
	   * @param args　プログラム起動時の引数
	   * @throws IOException　キーボードからの入力処理に失敗した場合
	   */
	  public static void main(String[] args) throws IOException {
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("xに整数を入力してください。");
	        int x = Integer.parseInt(br.readLine());
	        
	        System.out.println("yに整数を入力してください。");
	        int y = Integer.parseInt(br.readLine());
	        
	        if (x < y && x % 2 == 0 && y % 2 == 0) {
	        	System.out.println(x + "は" + y + "より小さく、かつ、" + x + "と" + y + "は共に偶数である。");
	        }
	        if (x == y && x < 0) {
	        	System.out.println(x + "と" + y + "は等しく、かつ、負の数である。");
	        }
	        if (x < y || x % 2 == 0) {
	        	System.out.println(x + "は" + y + "より小さい、または、" + x + "は偶数である。");
	        }
	   }
 }