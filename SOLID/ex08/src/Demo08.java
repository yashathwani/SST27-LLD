interface Vehicle {
    void startEngine();
    void pedal(int effort);
    void recharge(int kWh);
}
class Bicycle implements Vehicle {
    public void startEngine(){ throw new UnsupportedOperationException(); }
    public void pedal(int effort){ System.out.println("Pedal effort " + effort); }
    public void recharge(int kWh){ throw new UnsupportedOperationException(); }
}
public class Demo08 {
    public static void main(String[] args) {
        Vehicle v = new Bicycle();
        v.startEngine(); // crash
    }
}
