package chapter3; 	

import java.io.*;
/**
 * 入力した点数に沿った成績を表示するプログラムです。
 */
 public class Chapter3_1_3 {											
	  /**
	   * 入力した点数に沿った成績を表示します。
	   * 
	   * @param args
	   * @throws IOException
	   */
	  public static void main(String[] args) throws IOException
		{
			System.out.println("試験の点数を入力してください。");
			
			BufferedReader br = 
			 new BufferedReader(new InputStreamReader(System.in));
			
	        int num = Integer.parseInt(br.readLine());
	        
            if (num >= 80) {
	            System.out.println("優");
	            }
            else if (num >= 70) {
            	System.out.println("良");
            }
            else if (num >= 60) {
            	System.out.println("良");
            }
            else {
            	System.out.println("不可");
            }
	   }
 }