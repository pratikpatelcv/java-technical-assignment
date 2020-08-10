package kata.supermarket.discount;

import java.math.BigDecimal;
import java.util.List;

import kata.supermarket.Item;

public interface Discount {

    /**
     * Apply this discount on a given list of items to calculate how much saving has
     * been achieved.
     * 
     * @param items The items to apply this discount on.
     * @return The value of this discount given the provided list of items.
     */
    BigDecimal apply(List<Item> items);
}
