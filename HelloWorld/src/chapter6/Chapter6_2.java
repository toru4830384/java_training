package chapter6;

import java.util.ArrayList;
import java.util.List;

/**
 * 人物情報を表示するプログラムです。
 */
public class Chapter6_2 {
	
	/**
	 * 人物情報を表示します。
	 * 
	 * @param args プログラム起動時の引数
	 */
	public static void main(String[] args) {
		
		List<Person> personList = new ArrayList<>();
		
		personList.add(new Person(				
				"山田", 26, "東京都大田区大森", "090-0000-0000"));
		
		personList.add(new Person(				
				"鈴木", 33, "和歌山県和歌山市", "090-1111-2222"));
		
		personList.add(new Person(				
				"田中", 41, "宮城県仙台市", "090-3333-4444"));
		
		for (Person person : personList) {
			System.out.println(
					"私の名前は" + person.getName()
					+ "です。年齢は" + person.getAge()
					+ "歳です。住所は" + person.getAddress()
					+ "です。電話番号は" + person.getPhoneNumber()
					+ "です。");
		}
	}
}