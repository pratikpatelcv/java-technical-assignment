# Notes

Please add here any notes, assumptions and design decisions that might help up understand your though process.

# Approach

 * To identify a discount, the item/product needs to be identifiable i.e. a name/id.
 * The basket needs to be aware of which discounts are available, i.e. "Buy 1 get 1 free for milk" or "Buy 2 yoghurts for £1". This would most likely come in the form of a List<Discount> which is an interface that has an `BigDecimal apply<List<Item> basket>` method that would return the amount to subtract, i.e. if 1 yoghhurt is £0.75 and the discount is 2 yoghurts for £1, then the method would return "0.50" to subtract from the total.
 * One consideration is, can the same item be applied by multiple discounts ?  i.e. "buy one get one free milk" and "2 dairy products for £1". Most likely I will not have time to cover this in the changes.
 * One approach is to assume that a unit price is the same as a price per kilos, frankly I don't like this, it could lead to confusion, even if it would clean up the code/model.
 
# Post Task Notes
 
 * I went with a hierarchy approach for the Product and how it can be interpreted as a unit or by weight, this in reality would probably be 2 different products, i.e. "Loose banana" which is weighed, vs a "A bag of bananas" which would be a priced unit.
 * I ended up taking 15-20 mins longer while debugging some of the unit tests, because of pricing inconsistencies and assumptions I made between unit tests (I got caught out when I though Digestives were 0.33 when in BasketTest they were 1.55), Key lesson for myself in remembering to double check the numbers applicable in that test and not from another test.
 * To add another discount, i.e. 1kg of vegetables for £1, should be as straightforward as implementing Discount and adding it to the availableDiscounts list.