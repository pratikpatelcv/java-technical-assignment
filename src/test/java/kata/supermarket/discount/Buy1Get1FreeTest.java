package kata.supermarket.discount;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import kata.supermarket.Item;
import kata.supermarket.ProductByUnit;

public class Buy1Get1FreeTest {

    @Test
    public void applyShouldReturnZeroForEmptyList() {
        Buy1Get1Free discount = new Buy1Get1Free(new ProductByUnit("milk", new BigDecimal("0.49")));

        assertEquals(BigDecimal.ZERO, discount.apply(Collections.emptyList()));
    }

    @Test
    public void applyShouldReturnZeroForNullList() {
        Buy1Get1Free discount = new Buy1Get1Free(new ProductByUnit("milk", new BigDecimal("0.49")));

        assertEquals(BigDecimal.ZERO, discount.apply(null));
    }

    @Test
    public void applyShouldReturnZeroForNonMatchingList() {
        Buy1Get1Free discount = new Buy1Get1Free(new ProductByUnit("milk", new BigDecimal("0.49")));

        ProductByUnit digestives = new ProductByUnit("digestives", new BigDecimal("0.33"));
        List<Item> items = List.of(digestives.oneOf());

        assertEquals(BigDecimal.ZERO, discount.apply(items));
    }

    @Test
    public void applyShouldReturnOneDiscountValueForMatchingListOfTwoItems() {
        ProductByUnit milk = new ProductByUnit("milk", new BigDecimal("0.49"));
        Buy1Get1Free discount = new Buy1Get1Free(milk);

        List<Item> items = List.of(milk.oneOf(), milk.oneOf());

        assertEquals(new BigDecimal("0.49"), discount.apply(items));
    }

    @Test
    public void applyShouldReturnOneDiscountValueForMatchingListOfThreeItems() {
        ProductByUnit milk = new ProductByUnit("milk", new BigDecimal("0.49"));
        Buy1Get1Free discount = new Buy1Get1Free(milk);

        List<Item> items = List.of(milk.oneOf(), milk.oneOf(), milk.oneOf());

        assertEquals(new BigDecimal("0.49"), discount.apply(items));
    }

    @Test
    public void applyShouldReturnThreeDiscountValuesForMatchingListOfSevenItems() {
        ProductByUnit milk = new ProductByUnit("milk", new BigDecimal("0.49"));
        Buy1Get1Free discount = new Buy1Get1Free(milk);

        List<Item> items = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            items.add(milk.oneOf());
        }

        assertEquals(new BigDecimal("1.47"), discount.apply(items));
    }

    @Test
    public void applyShouldReturnOnlyMatchingProductByUnitDiscountValue() {
        ProductByUnit milk = new ProductByUnit("milk", new BigDecimal("0.49"));
        ProductByUnit digestives = new ProductByUnit("digestives", new BigDecimal("0.33"));
        Buy1Get1Free discount = new Buy1Get1Free(milk);

        List<Item> items = List.of(milk.oneOf(), milk.oneOf(), digestives.oneOf(), digestives.oneOf());

        assertEquals(new BigDecimal("0.49"), discount.apply(items));
    }
}
