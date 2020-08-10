package kata.supermarket;

import java.math.BigDecimal;

public class ProductByUnit extends Product{

    private final BigDecimal pricePerUnit;

    public ProductByUnit(final String name, final BigDecimal pricePerUnit) {
        super(name);
        this.pricePerUnit = pricePerUnit;
    }

    public BigDecimal pricePerUnit() {
        return pricePerUnit;
    }
    
    public Item oneOf()
    {
        return new ItemByUnit(this);
    }

}
