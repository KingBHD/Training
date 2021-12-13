package constructors;

public class ConsOverload {
    private int x;
    private final int y;

    ConsOverload() {
        x = 0;
        y = 0;
        System.out.println("I'm a non parameterized constructor");
    }

    ConsOverload(int a) {
        y = a;
        System.out.println("I am in constructor with one parameter");
    }

    ConsOverload(int a, int b) {
        x = a;
        y = b;
        System.out.println("I am in constructor with two parameters");
    }

    public void prn() {
        System.out.println("x = " + x + " y = " + y);
    }

    public static void main(String[] args) {
        ConsOverload c1 = new ConsOverload();
        ConsOverload c2 = new ConsOverload(10);
        ConsOverload c3 = new ConsOverload(10, 20);

        c1.prn();
        c2.prn();
        c3.prn();
    }
}
