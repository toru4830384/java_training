package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

/**
 * 入力された日付の1ヶ月後の日付を表示するプログラムです。
 */
 public class Chapter7_1 {
	
	/**
	 * 入力された日付の1ヶ月後の日付を表示します。
	 * 
	 * @param args プログラム起動時の引数
	 * @throws IOException キーボードからの入力処理に失敗した場合
	 */
	public static void main(String[] args) throws IOException {
		
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("日付を入力してください。(yyyy/MM/dd)");
		String inputDate = br.readLine();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate date = LocalDate.parse(inputDate, formatter);
		LocalDate nextMonth = date.plusMonths(1);
		
		System.out.println("1ヶ月後は" + nextMonth.format(formatter) + "です。");
	}
}