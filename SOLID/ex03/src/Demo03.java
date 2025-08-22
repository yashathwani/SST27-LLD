class Shipment {
    String type; double weightKg;
    Shipment(String type, double w){ this.type=type; this.weightKg=w; }
}
class ShippingCostCalculator {
    double cost(Shipment s){
        if ("STANDARD".equals(s.type)) return 50 + 5*s.weightKg;
        if ("EXPRESS".equals(s.type))  return 80 + 8*s.weightKg;
        if ("OVERNIGHT".equals(s.type))return 120 + 10*s.weightKg;
        throw new IllegalArgumentException("Unknown type: " + s.type);
    }
}
public class Demo03 {
    public static void main(String[] args) {
        System.out.println(new ShippingCostCalculator().cost(new Shipment("EXPRESS", 2.0)));
    }
}
