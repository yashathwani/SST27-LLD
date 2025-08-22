class Bird { void fly(){ System.out.println("Flap!"); } }
class Penguin extends Bird {
    @Override void fly(){ throw new UnsupportedOperationException("Can't fly"); }
}
class Aviary {
    void release(Bird b){ b.fly(); System.out.println("Released"); }
}
public class Demo06 {
    public static void main(String[] args) {
        new Aviary().release(new Bird());
        new Aviary().release(new Penguin()); // runtime error
    }
}
