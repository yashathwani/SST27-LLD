interface Machine {
    void print(String text);
    void scan(String dstPath);
    void fax(String number);
}
class BasicPrinter implements Machine {
    public void print(String text){ System.out.println("Print: "+text); }
    public void scan(String dstPath){ throw new UnsupportedOperationException(); }
    public void fax(String number){ throw new UnsupportedOperationException(); }
}
public class Demo07 {
    public static void main(String[] args) {
        Machine m = new BasicPrinter();
        m.print("Hello");
        m.scan("/tmp/out"); // blows up
    }
}
