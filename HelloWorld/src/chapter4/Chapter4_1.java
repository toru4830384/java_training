package chapter4;

/**
 * 契約者情報を表示して 遅延利息金が発生している人を数えるプログラムです。
 */
public class Chapter4_1 {
	
	/**
	 * 契約者名と保険料を表示して 遅延利息金が発生している人数を出力します。
	 * 
	 * @param args プログラム起動時の引数
	 */
	public static void main(String[] args) {

		String[][] contracts = { 
				{ "中村", "5000", "2000" }, 
				{ "田島", "3000", "" }, 
				{ "小澤", "4500", "" },
				{ "大西", "6000", "3500" } 
	    };

		int count = 0;

		for (int i = 0; i < contracts.length; i++) {
			System.out.println("契約者名:" + contracts[i][0] 
					+ "、保険料:" + contracts[i][1] + "円");

			if (!contracts[i][2].equals("")) {
				count++;
			}
		}

		System.out.println("遅延利息金が発生している人数は" 
		                   + count + "人です。");
	}
}