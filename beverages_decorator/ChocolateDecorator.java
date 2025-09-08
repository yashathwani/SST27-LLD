package beverages_decorator;

public class ChocolateDecorator extends Beverage{
    private final Beverage beverage;

    public ChocolateDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 5 + beverage.cost();
    }
    
}
