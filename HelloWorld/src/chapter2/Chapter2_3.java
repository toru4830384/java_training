package chapter2;
/**
 * 2つの値を入れ替えた前後の値を出力するプログラムです。
 */
 public class Chapter2_3 {
	/**
	 * メインメソッド
	 * @param args プログラム起動時の引数
	 */
	 public static void main(String[] args) {
	     
		 int x = 1;
		 int y = 2;
		 
		 System.out.println("前: x = " + x + ", y = " + y);
		 
		 int temp = x;
		 x = y;
		 y = temp;
		 
		 System.out.println("後: x = " + x + ", y = " + y);
	 }
	 
}