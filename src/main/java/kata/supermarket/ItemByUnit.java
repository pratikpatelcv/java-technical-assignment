package kata.supermarket;

import java.math.BigDecimal;

public class ItemByUnit implements Item {

    private final ProductByUnit product;

    ItemByUnit(final ProductByUnit product) {
        this.product = product;
    }

    public BigDecimal price() {
        return product.pricePerUnit();
    }
    
    public Product product()
    {
        return product;
    }
}
