package kata.supermarket.discount;

import java.math.BigDecimal;
import java.util.List;

import kata.supermarket.Item;
import kata.supermarket.Product;

public class Buy1Get1Free implements Discount {

    private final Product product;

    public Buy1Get1Free(final Product product) {
        this.product = product;
    }

    @Override
    public BigDecimal apply(List<Item> items) {
        if (items == null || items.isEmpty()) {
            return BigDecimal.ZERO;
        }

        return null;
    }
}
