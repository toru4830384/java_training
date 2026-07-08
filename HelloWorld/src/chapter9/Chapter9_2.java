package chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Processインターフェイスを利用した処理を行うクラスです。
 */
class Chapter9_2 {
	
	/**
	 * 処理モードを選択して名前と年齢を入力し、処理を行います。
	 * 
	 * @param args プログラム起動時の引数
	 * @throws IOException キーボードからの入力処理に失敗した場合
	 */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Process process;
		
		System.out.println("処理モードを選んでください。");
		System.out.println("1:Aモード");
		System.out.println("2:Bモード");
		
		int mode = Integer.parseInt(br.readLine());
		
		if (mode != 1 && mode != 2) {
			System.out.println("1または2を入力してください。");
			return;
		}
		
	    if (mode == 1) {
	    	process = new ProcessA();
	    } else {
	    	process = new ProcessB();
	    }
		
		System.out.println("名前を入力してください。");
		String name = br.readLine();
		
		System.out.println("年齢を入力してください。");
	    int age = Integer.parseInt(br.readLine());
		
	    if (process.check(name, age)) {
	    	process.run(name, age);
	    } else {
	    	System.out.println("入力エラーです。");
	    }
	}
}