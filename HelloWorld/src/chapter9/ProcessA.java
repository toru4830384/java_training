package chapter9;

/**
 * Aモードの処理を行うクラスです。
 */
public class ProcessA implements Process {
	
	/**
	 * 名前と年齢をチェックします。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 * @return 名前が10文字未満かつ年齢が0~140の場合はtrue、それ以外はfalse
	 */
	@Override
	public boolean check(String name, int age) {
		return name.length() < 10 && age >= 0 && age <= 140;
	}
	
	/**
	 * 名前と年齢を表示します。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 */
	@Override
	public void run(String name, int age) {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}
}