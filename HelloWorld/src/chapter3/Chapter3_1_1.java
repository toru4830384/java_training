package chapter3; 	

import java.io.*;
/**
 * 入力された点数から合否を判定するプログラムです。
 */
 public class Chapter3_1_1 {											
	  /**
	   * 点数を入力し60点以上で合格、
	   * 59点以下で不合格と表示します。
	   * 
	   * @param args プログラム起動時の引数
	   * @throws IOException キーボードからの入力処理に失敗した場合
	   */
	  public static void main(String[] args) throws IOException
		{
			System.out.println("試験の点数を入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
	        int num = Integer.parseInt(br.readLine());
	        
            if (num >= 60) {
	            System.out.println("合格です。");
	            }
	          else {
	            System.out.println("不合格です。");
	          }
	   }
 }