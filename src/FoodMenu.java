import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FoodMenu {

	public static void main(String[] args) {

		Map<String, BigDecimal> menu = new HashMap<String, BigDecimal>();

		menu.put("Spaghetti", new BigDecimal("8.97"));
		menu.put("Lasagna", new BigDecimal("10.98"));
		menu.put("Pizza", new BigDecimal("15.50"));
		menu.put("Caesar Salad", new BigDecimal("7.00"));
		menu.put("Kale Salad", new BigDecimal("7.00"));

		System.out.println("The price of Spaghetti is  $" + menu.get("Spaghetti"));

		System.out.println("Hey boss, you have " + menu.size() + " items on your menu.");

		menu.put("Bottle of Champagne", new BigDecimal("200.00"));
		menu.put("Bottle of Vintage Wine", new BigDecimal("175.00"));

		System.out.println("We have two new items added to the menu...");
		System.out.println("Bottle of Champange at $" + menu.get("Bottle of Champagne"));
		System.out.println("Bottle of Vintage Wine at $" + menu.get("Bottle of Vintage Wine"));
		System.out.print("Let me check if you can order a bottle for the table...");
		if (menu.containsKey("Bottle of Champagne")) {
			System.out.println("Yes you can!");
		}
		if (!menu.containsValue(new BigDecimal("13.50"))) {
			System.out.println("That is def not $13.50 it is $15.50.");
		}
		menu.remove("Kale Salad");

		System.out.println("Our new menu is:");
		for (Entry<String, BigDecimal> entry : menu.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		menu.clear();
		System.out.println(menu.isEmpty() + " the menu is completely empty.");
	}

}
