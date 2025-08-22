class SqlOrderRepository {
    void save(String id){ System.out.println("Saved order " + id + " to SQL"); }
}
class OrderController {
    void create(String id){
        SqlOrderRepository repo = new SqlOrderRepository(); // hard dependency
        repo.save(id);
        System.out.println("Created order: " + id);
    }
}
public class Demo09 {
    public static void main(String[] args) {
        new OrderController().create("ORD-1");
    }
}
