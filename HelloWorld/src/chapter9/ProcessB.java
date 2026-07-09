package chapter9;

/**
 * Bモードの処理を行うクラスです。
 */
public class ProcessB implements Process {
	
	/**
	 * 名前と年齢をチェックします。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 * @return 名前が5~20文字かつ年齢が30~60の場合はtrue、それ以外はfalse
	 */
	@Override
	public boolean check(String name, int age) {
		return name.length() >= 5 && name.length() <= 20 && age >= 30 && age <= 60;
	}
	
	/**
	 * 名前と年齢を表示します。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 */
	@Override
	public void run(String name, int age) {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}