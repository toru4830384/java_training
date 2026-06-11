package 実力確認問題;
/**
 * 2つの値の入れ替えた前後の値を出力するプログラムです。
 */
 public class 演算子3 {
	
	 public static void main(String[] args) {
	     /**
	      * int型の変数xに1, yに2を代入した値を出力します。
	      */
		 int x = 1;
		 int y = 2;
		 
		 System.out.println("前: x = " + x + ", y = " + y);
		 /**
		  * tempにxを一時的に保存し、xにyの値を代入します。
		  * tempに保存したxの値をyに代入することで入れ替え後の値を表示します。
		  */
		 int temp = x;
		 x = y;
		 y = temp;
		 
		 System.out.println("後: x = " + x + ", y = " + y);
	 }
	 
}