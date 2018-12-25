package decorator_example_coffee;

public class Main {

	public static void main(String[] args) {
		CoffeeVariation c = new WithMilk(new BasicCoffee());
		System.out.println(c.getDetails());

	}

}
