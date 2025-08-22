class Payment {
    String provider; double amount;
    Payment(String p, double a){ provider=p; amount=a; }
}
class PaymentService {
    String pay(Payment p){
        switch (p.provider) {
            case "CARD": return "Charged card: " + p.amount;
            case "UPI":  return "Paid via UPI: " + p.amount;
            case "WALLET": return "Wallet debit: " + p.amount;
            default: throw new RuntimeException("No provider");
        }
    }
}
public class Demo04 {
    public static void main(String[] args) {
        System.out.println(new PaymentService().pay(new Payment("UPI", 499)));
    }
}
