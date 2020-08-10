package kata.supermarket.discount;

import java.math.BigDecimal;
import java.util.List;

import kata.supermarket.Item;
import kata.supermarket.Product;

public class Buy1Get1Free implements Discount {

    /* TODO: Change constant name, it doesn't make the most sense... */
    private static final int DISCOUNT_DIVIDER = 2;

    private final Product product;

    public Buy1Get1Free(final Product product) {
        this.product = product;
    }

    @Override
    public BigDecimal apply(List<Item> items) {

        // Early return for validation only
        if (items == null || items.isEmpty()) {
            return BigDecimal.ZERO;
        }

        long matchingItemCount = items.stream().filter(i -> i.product().equals(this.product)).count();
        double discountableItemCount = Math.floor(matchingItemCount / DISCOUNT_DIVIDER);

        BigDecimal result = BigDecimal.ZERO;
        if (discountableItemCount > 0) {
            result = product.pricePerUnit().multiply(new BigDecimal(discountableItemCount));
        }

        return result;
    }
}
