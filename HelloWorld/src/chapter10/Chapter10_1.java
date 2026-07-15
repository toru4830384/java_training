package chapter10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Processクラスを利用した処理を行うクラスです。
 */
class Chapter10_1 {

	/**
	 * 処理モードを選択して名前と年齢を入力し、処理を行います。
	 * 
	 * @param args プログラム起動時の引数
	 * @throws IOException キーボードからの入力処理に失敗した場合
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("処理モードを選んでください。");
			System.out.println("1:Aモード");
			System.out.println("2:Bモード");

			int mode = Integer.parseInt(br.readLine());

			Process process = null;

			if (mode == 1) {
				process = new ProcessA();
			} else if (mode == 2) {
				process = new ProcessB();
			} else {
				throw new CustomException("1または2を入力してください。");
			}

			System.out.println("名前を入力してください。");
			String name = br.readLine();

			System.out.println("年齢を入力してください。");
			int age = Integer.parseInt(br.readLine());

			process.check(name, age);
			process.setting(name, age);
			process.run();

			br.close();

		} catch (NumberFormatException e) {
			System.out.println("整数を入力してください。");
		} catch (CustomException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println("入出力エラーです。");
		}
	}
}