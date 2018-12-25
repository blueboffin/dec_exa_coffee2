package decorator_example_coffee;

public class WithMilk implements CoffeeVariation {
	private CoffeeVariation base;
	public WithMilk(CoffeeVariation cv) {
		base = cv;
	}
	@Override
	public String getDetails() {
		return base.getDetails()+", Milk";
	}

	@Override
	public int getPrice() {
		return base.getPrice()+1;
	}

}
