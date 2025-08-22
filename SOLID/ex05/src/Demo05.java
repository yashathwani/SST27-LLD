class Rectangle {
    protected int w,h;
    void setWidth(int w){ this.w = w; }
    void setHeight(int h){ this.h = h; }
    int area(){ return w*h; }
}
class Square extends Rectangle {
    @Override void setWidth(int w){ this.w = this.h = w; }
    @Override void setHeight(int h){ this.w = this.h = h; }
}
public class Demo05 {
    static int areaAfterResize(Rectangle r){
        r.setWidth(5); r.setHeight(4); return r.area();
    }
    public static void main(String[] args) {
        System.out.println(areaAfterResize(new Rectangle())); // 20
        System.out.println(areaAfterResize(new Square()));    // 16 (!) violates expectation
    }
}
