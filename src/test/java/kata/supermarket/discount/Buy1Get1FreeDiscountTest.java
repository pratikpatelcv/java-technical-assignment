package kata.supermarket.discount;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Collections;

import org.junit.Test;

import kata.supermarket.Product;

public class Buy1Get1FreeDiscountTest {

	@Test
	public void applyShouldReturnZeroForEmptyList() {
		Buy1Get1Free discount = new Buy1Get1Free(new Product("milk", new BigDecimal("0.49")));

		assertEquals(BigDecimal.ZERO, discount.apply(Collections.emptyList()));
	}
}
