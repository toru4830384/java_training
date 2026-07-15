package chapter10;

/**
 * Bモードの処理を行うクラスです。
 */
public class ProcessB extends Process {

	/**
	 * 名前と年齢をチェックします。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 * @throws CustomException 条件を満たさない場合
	 */
	@Override
	public void check(String name, int age) throws CustomException {
		if (name.length() < 5 || name.length() > 20 || age < 30 || age > 60) {
			throw new CustomException("入力エラーです。");
		}
	}

	/**
	 * 名前と年齢を表示します。
	 */
	@Override
	public void run() {
		System.out.println("名前：" + name);
		System.out.println("年齢：" + age);
	}
}