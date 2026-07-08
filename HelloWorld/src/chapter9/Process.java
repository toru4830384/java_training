package chapter9;

/**
 * 処理を行うためのインターフェイスです。
 */
public interface Process {
	
	/**
	 * 名前と年齢をチェックします。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 * @return 条件を満たす場合はtrue、満たさなければfalse
	 */
	boolean check(String name, int age);
	
	/**
	 * 処理を実行します。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 */
	void run(String name, int age);
}