package chapter10;

/**
 * 独自の例外クラスです。
 */
public class CustomException extends Exception {

	/**
	 * 例外メッセージを設定します。
	 * 
	 * @param message 例外メッセージ
	 */
	public CustomException(String message) {
		super(message);
	}
}