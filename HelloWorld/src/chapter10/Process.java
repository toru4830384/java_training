package chapter10;

/**
 * 処理を行うためのインターフェースです。
 */
public interface Process {
	
	/**
	 * 名前と年齢が条件を満たしているかチェックします。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 * @throws CustomException 条件を満たさない場合
	 */
	public abstract void check(String name, int age) throws CustomException;
	
	/**
	 * 名前と年齢を設定します。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 */
	void setting(String name, int age);
	
	/**
	 * 処理を行います。
	 */
	void run();
}