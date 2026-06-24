package chapter5;

/**
 * 商品情報を管理するクラスです。
 */
public class Product {
    
	/**
	 * 商品名です。
	 */
	private String name;
	
	/**
	 * 商品の金額です。
	 */
	private int price;
	
	/**
	 * 消費税率(一律10%)です。
	 */
	private static final double TAX = 0.1;

	/**
	 * 商品名を設定します。
	 * 
	 * @param name 商品名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 商品名を取得します。
	 * 
	 * @return 商品名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 商品の金額を設定します。
	 * 
	 * @param price 商品の金額
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * 商品の金額を取得します。
	 * 
	 * @return 商品の金額
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * 税込の金額を計算して取得します。
	 * 
	 * @return 税込の金額
	 */
	public int getTotalPrice() {
		return (int) (price * (1 + TAX));
	}
}