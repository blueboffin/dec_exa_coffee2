package decorator_example_coffee;

public class Main {

	public static void main(String[] args) {
		CoffeeVariation c = new BasicCoffee();
		System.out.print("Black "+c.getDetails());
		System.out.println(", "+c.getPrice());
		CoffeeVariation d = new WithMilk(c);
		System.out.print("With Milk "+d.getDetails());
		System.out.println(", "+d.getPrice());

	}

}
