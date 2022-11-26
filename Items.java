package snapcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Items {
	private static double SALES_TAX = 12.50;
	private List<Item> item = new ArrayList<>();
	private BigDecimal totalPrice;

	public List<Item> getItem() {
		return item;
	}

	public void setItem(List<Item> item) {
		this.item = item;
	}

	public BigDecimal getTotalPrice() {
		double amount = this.item.stream().mapToDouble(item -> item.getTotalPrice().doubleValue()).sum();
		amount = amount + (amount * SALES_TAX) / 100;
		// MathContext mc = new MathContext(2, RoundingMode.valueOf(2));
		this.totalPrice = new BigDecimal(amount);
		return this.totalPrice;
	}
}
