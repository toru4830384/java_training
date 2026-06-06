package 実力確認問題;

 public class 演算子3 {
	 
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