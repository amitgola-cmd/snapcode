package snapcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pricing {
	public static void main(String args[]) {
		Items item = new Items();
		List<Item> l = new ArrayList<>();
		l.add(Item.addItem(12, new BigDecimal(39.99), 1, "Dove"));
		l.add(Item.addItem(12, new BigDecimal(39.99), 3, "Dove"));
		l.add(Item.addItem(12, new BigDecimal(39.99), 5, "Dove"));
		item.setItem(l);
		System.out.print("Total Price " + item.getTotalPrice());

		List<Item> l1 = new ArrayList<>();
		l1.add(Item.addItem(12, new BigDecimal(39.99), 2, "Dove"));
		l1.add(Item.addItem(15, new BigDecimal(99.99), 2, "AxeDeo"));
		item.setItem(l1);
		System.out.print("Total Price " + item.getTotalPrice());
	}
}
