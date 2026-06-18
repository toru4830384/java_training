package chapter4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 商品の情報を入力して
 * 支払金額の不足有無、不足金額の合計を表示するプログラムです。
 */
public class Chapter4_2 {
	
	/**
	 * 商品名、単価、支払金額を入力して
	 * 支払金額の不足有無、不足金額の合計を表示します。
	 * 
	 * @param args プログラム起動時の引数
	 * @throws IOException キーボードからの入力処理に失敗した場合
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[][] products = new String[3][3];

		for (int i = 0; i < products.length; i++) {

			System.out.println("商品を入力してください。");
			products[i][0] = br.readLine();

			System.out.println("単価を入力してください。");
			products[i][1] = br.readLine();

			System.out.println("支払金額を入力してください。");
			products[i][2] = br.readLine();
		}
		
        int total = 0;
        
        for (int i = 0; i < products.length; i++) {
        	int price = Integer.parseInt(products[i][1]);
        	int pay = Integer.parseInt(products[i][2]);
        	
        	if (pay < price) {
        		System.out.println(products[i][0] + "、" + price + "円、支払金額不足");
        		
        		total += price - pay; 
        	} else {
        		System.out.println(products[i][0] + "、" + price + "円、支払金額過不足無し");
        	}
        }
        
        System.out.println("全体の不足金：" + total + "円");
	}
}