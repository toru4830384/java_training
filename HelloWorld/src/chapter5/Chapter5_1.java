package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 商品情報を管理するクラスです。
 */
class Product {

	String name;
	int price;
	double tax = 0.1;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setPrice(int price) {
		this.price = price;
	}

	int getPrice() {
		return price;
	}

	int getTotalPrice() {
		return (int) (price * (1 + tax));
	}
}

/**
 * 商品名と金額を入力し、 税込の購入額を表示するプログラムです。
 */
public class Chapter5_1 {

	/**
	 * 商品名と金額を入力し、 税込の購入額を表示します。
	 * 
	 * @param args プログラム起動時の引数
	 * @throws IOException キーボードからの入力処理に失敗した場合
	 */
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("商品名を入力してください。");
		String name = br.readLine();

		System.out.println("金額を入力してください。");
		int price = Integer.parseInt(br.readLine());

		Product product = new Product();

		product.setName(name);
		product.setPrice(price);

		System.out.println("購入額：" + product.getTotalPrice() + "円");
	}
}