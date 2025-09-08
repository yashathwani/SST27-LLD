package beverages_decorator;

public class SoyMilkDecorator extends Beverage {
    private final Beverage beverage;

    public SoyMilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public int cost() {
        return 3 + beverage.cost();
    }
    
}
