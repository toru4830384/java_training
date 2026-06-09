package 実力確認問題;
/**
 * int型の変数xに乗算と徐算を行うプログラムです。
 */
public class 演算子4 {

    public static void main(String[] args) {
        /**
         * 変数xを3倍にした後、その値を2分の1にした値を出力します。
         */
        int x = 7; 
        x = x * 3;
        System.out.println(x);
        
        x = x / 2;
        System.out.println(x);
    }
}