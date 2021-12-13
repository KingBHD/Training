package constructors;

public class CopyCons {

    private final int x;
    private final int y;

    CopyCons() {
        x = 10;
        y = 20;
        System.out.println("I'm in simple constructor");
    }

    CopyCons(CopyCons obj) {
        x = obj.x * 2;
        y = obj.y * 2;
        System.out.println("I'm in copy constructor");
    }

    public void prn() {
        System.out.println("x = " + x + " y = " + y);
    }

    public static void main(String[] args) {
        CopyCons obj = new CopyCons();
        CopyCons obj2 = new CopyCons(obj);

        obj.prn();
        obj2.prn();
    }

}
