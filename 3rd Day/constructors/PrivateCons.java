package constructors;

public class PrivateCons {
    int x, y;

    private PrivateCons() {
        x = 10;
        y = 20;
        System.out.println("I'm in simple constructor");
    }

    static void prn() {
        System.out.println("After creating object inside the calss");
        PrivateCons obj = new PrivateCons();
        System.out.println("x = " + obj.x);
        System.out.println("y = " + obj.y);
    }
}

class PrivateConsMain {

    public static void main(String[] args) {
        PrivateCons.prn();
    }
}
