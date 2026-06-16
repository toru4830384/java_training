package chapter3; 	

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 * 入力された点数に沿った評価を表示するプログラムです。
 */
 public class Chapter3_1_2 {											
	  /**
	   * 入力した点数に沿った評価を表示します。
	   * 
	   * @param args プログラム起動時の引数
	   * @throws IOException キーボードからの入力に失敗した場合
	   */
	  public static void main(String[] args) throws IOException {
		  
			System.out.println("試験の点数を入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
	        int num = Integer.parseInt(br.readLine());
	        
	        if (num >= 0 && num <= 100) {
	        
               if (num >= 80) {
	               System.out.println("たいへんよくできました。");
	           } else if (num >= 60) {
	               System.out.println("よくできました。");
	           } else {
	               System.out.println("ざんねんでした。");
	           }
               
	        } else {
	        	System.out.println("点数は0~100点で入力してください。");
	        }
	  }
 }
