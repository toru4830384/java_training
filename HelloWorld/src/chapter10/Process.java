package chapter10;

/**
 * 処理を行うための抽象クラスです。
 */
public abstract class Process {
	
	/**
	 * 名前
	 */
	protected String name;
	
	/**
	 * 年齢
	 */
	protected int age;
	
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
	public void setting(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * 処理を行います。
	 */
	public abstract void run();
}