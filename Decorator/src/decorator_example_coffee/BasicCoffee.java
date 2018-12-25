package decorator_example_coffee;

public class BasicCoffee implements CoffeeVariation{
	public String getDetails() {
		return ("Black");
	}
	public int getPrice() {
		return (10);
	}
}
