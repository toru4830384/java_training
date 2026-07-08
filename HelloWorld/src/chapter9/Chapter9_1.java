package chapter9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Chapter9_1 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		CalculateBase[] calc = {
				new Add(), new Sub(), new Div(), new Mul()
		};
		
		String[] operator = {
				"+", "-", "/", "*"
		};
		
		System.out.println("1~4の中から計算したい値を1つ選んでください。");
		System.out.println("1:足し算");
		System.out.println("2:引き算");
		System.out.println("3:割り算");
		System.out.println("4:掛け算");
		
		int select = Integer.parseInt(br.readLine());
		
		System.out.println("1つ目の数字を入力してください。");
		int x = Integer.parseInt(br.readLine());
		
		System.out.println("2つ目の数字を入力してください。");
		int y = Integer.parseInt(br.readLine());
		
		int result = calc[select - 1].calculate(x, y);
		
		System.out.println(x + " " + operator[select - 1] + " " + y + " = " + result);
	}
}