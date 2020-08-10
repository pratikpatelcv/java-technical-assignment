package kata.supermarket.discount;

import java.math.BigDecimal;
import java.util.List;

import kata.supermarket.Item;

public interface Discount {

	BigDecimal apply(List<Item> items);
}
