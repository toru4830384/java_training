package 実力確認問題; 	

import java.io.*;

 public class if文1_1 {											
	  
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