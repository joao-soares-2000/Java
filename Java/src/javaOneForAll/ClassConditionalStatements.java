package javaOneForAll;

import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class ClassConditionalStatements {
	public static void main(String[] args) {
		// if salary > 2000 "buy ps5" "Don't buy ps5"
		double salary = 3500D;
		String shouldBuyMessage = "Buy";
		String shouldNotBuyMessage = "Dont't buy";
		// ternary conditional
		// (condition) ? <true> : <false>
		String displayMessage = salary > 2000 ? shouldBuyMessage : shouldNotBuyMessage;
		System.out.println(displayMessage);
	}

}
