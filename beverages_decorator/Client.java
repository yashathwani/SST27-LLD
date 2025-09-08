package beverages_decorator;

public class Client {

	public static void main(String[] args) {
		

		
		Beverage coffee = new Cappuccino();
		System.out.println("Coffee");
		System.out.println(coffee.cost());
		Beverage soyMilkCoffee = new SoyMilkDecorator(coffee);
		System.out.println("Soy Milk Coffee");
		System.out.println(soyMilkCoffee.cost());
		Beverage chocolateSoyMilkCoffee = new ChocolateDecorator(soyMilkCoffee);
		System.out.println("Chocolate Soy Milk Coffee");
		System.out.println(chocolateSoyMilkCoffee.cost());
		
        
		
		

	}

}