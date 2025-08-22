class Frame { byte[] data; Frame(byte[] d){ this.data=d; } }
class Player {
    private Frame last;
    void play(byte[] fileBytes){
        // decode
        Frame f = new Frame(fileBytes); // pretend decoding
        last = f;
        // draw UI
        System.out.println("\u25B6 Playing " + fileBytes.length + " bytes");
        // cache
        System.out.println("Cached last frame? " + (last!=null));
    }
}
public class Demo02 {
    public static void main(String[] args) {
        new Player().play(new byte[]{1,2,3,4});
    }
}
