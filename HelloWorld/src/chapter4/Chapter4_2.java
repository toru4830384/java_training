package chapter4;

import java.io.*;

public class Chapter4_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));

		String[][] products = new String[3][3];

		for (int i = 0; i < products.length; i++) {

			System.out.println("商品を入力してください。");
			products[i][0] = br.readLine();

			System.out.println("単価を入力してください。");
			products[i][1] = br.readLine();

			System.out.println("支払金額を入力してください。");
			products[i][2] = br.readLine();
		}
	}
}