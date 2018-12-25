package decorator_example_coffee;

public class WithSugar implements CoffeeVariation {
	private CoffeeVariation base;
	public WithSugar(CoffeeVariation cv) {
		base = cv;
	}
	@Override
	public String getDetails() {
		return base.getDetails()+", Sugar";
	}

	@Override
	public int getPrice() {
		return base.getPrice()+1;
	}

}
