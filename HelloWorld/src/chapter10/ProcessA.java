package chapter10;

/**
 * Aモードの処理を行うクラスです。
 */
public class ProcessA extends Process {

	/**
	 * 名前と年齢をチェックします。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 * @throws CustomException 条件を満たさない場合
	 */
	@Override
	public void check(String name, int age) throws CustomException {
		if (name.length() >= 10 || age < 0 || age > 140) {
			throw new CustomException("入力エラーです。");
		}
	}

	/**
	 * 名前と年齢を表示します。
	 */
	@Override
	public void run() {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "です。");
	}
}