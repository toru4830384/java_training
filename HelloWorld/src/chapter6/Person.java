package chapter6;

/**
 * 人物情報を管理するクラスです。
 */
public class Person { 
	
	/**
	 * 名前です。
	 */
	private String name;
	
	/**
	 * 年齢です。
	 */
	private int age;
	
	/**
	 * 住所です。
	 */
	private String address;
	
	/**
	 * 電話番号です。
	 */
	private String phoneNumber;
	
	/**
	 * newをしたときに自動で呼ばれる
	 * 人物情報を最初に設定するメソッドです。
	 * 
	 * @param name 名前
	 * @param age 年齢
	 * @param address 住所
	 * @param phoneNumber 電話番号
	 */
	public Person(String name, int age, String address, String phoneNumber) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * 名前を取得します。
	 * 
	 * @return　名前
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 年齢を取得します。
	 * 
	 * @return 年齢
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * 年齢を設定します。
	 * 
	 * @param age 年齢
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * 年齢を設定します。
	 * 
	 * @param age 年齢
	 */
	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}
	
	/**
	 * 住所を取得します。
	 * 
	 * @return 住所
	 */
	public String getAddress() {
		return address;
	}
	
	/**
	 * 電話番号を取得します。
	 * 
	 * @return 電話番号
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
}