package kata.supermarket;

import java.util.Objects;

public abstract class Product {

    private final String name;

    public Product(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Product))
            return false;
        Product other = (Product) obj;
        return Objects.equals(name, other.name);
    }

}
