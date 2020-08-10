package kata.supermarket;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

	private final BigDecimal pricePerUnit;
	private final String name;

	public Product(final String name, final BigDecimal pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
		this.name = name;
	}

	BigDecimal pricePerUnit() {
		return pricePerUnit;
	}

	public Item oneOf() {
		return new ItemByUnit(this);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, pricePerUnit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Product))
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name) && Objects.equals(pricePerUnit, other.pricePerUnit);
	}

}
