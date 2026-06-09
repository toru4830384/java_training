package chapter2;
/**
 * int型の変数xの値を3倍にした後、その値を半分にするプログラムです。
 */
 public class Chapter2_4 {
    /**
     * @param args プログラム起動時の引数
     */
     public static void main(String[] args) {
        
         int x = 7; 
         x = x * 3;
         System.out.println(x);
        
         x = x / 2; 
         System.out.println(x);
     }
}