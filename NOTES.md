# Notes

Please add here any notes, assumptions and design decisions that might help up understand your though process.

# Approach

 * To identify a discount, the item/product needs to be identifiable i.e. a name/id.
 * The basket needs to be aware of which discounts are available, i.e. "Buy 1 get 1 free for milk" or "Buy 2 yoghurts for £1". This would most likely come in the form of a List<Discount> which is an interface that has an `BigDecimal apply<List<Item> basket>` method that would return the amount to subtract, i.e. if 1 yoghhurt is £0.75 and the discount is 2 yoghurts for £1, then the method would return "0.50" to subtract from the total.
 * One consideration is, can the same item be applied by multiple discounts ?  i.e. "buy one get one free milk" and "2 dairy products for £1". Most likely I will not have time to cover this in the changes.
 * One approach is to assume that a unit price is the same as a price per kilos, frankly I don't like this, it could lead to confusion, even if it would clean up the code/model.