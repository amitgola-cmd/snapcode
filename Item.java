package snapcode;

import java.math.BigDecimal;

public class Item {
	private int code;
	private BigDecimal price;
	private BigDecimal totalPrice;
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}


	private int quanity;
	private String productName;
	
	
	public static Item addItem(int code,BigDecimal price,int quantity,String name) {
		Item i = new Item();
		i.code = code;
		i.price = price;
		i.totalPrice = new BigDecimal(price.doubleValue() * (double)quantity);
		i.quanity = quantity; 
		i.productName = name;
		return i;
	}
	
}
