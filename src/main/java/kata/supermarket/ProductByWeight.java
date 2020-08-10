package kata.supermarket;

import java.math.BigDecimal;

public class ProductByWeight extends Product {

    private final BigDecimal pricePerKilo;

    public ProductByWeight(final String name, final BigDecimal pricePerKilo) {
        super(name);
        this.pricePerKilo = pricePerKilo;
    }

    public BigDecimal pricePerKilo() {
        return pricePerKilo;
    }

    public Item weighing(final BigDecimal weightInKilos) {
        return new ItemByWeight(this, weightInKilos);
    }
}
