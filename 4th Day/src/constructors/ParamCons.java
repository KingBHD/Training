package constructors;

public class ParamCons {
    private final int x;
    private final int y;

    public ParamCons(int a, int y) {
        x = a;
        this.y = y;
        System.out.println("I'm in parameterized constructor");
    }

    public void prn() {
        System.out.println("x = " + x + " y = " + y);
    }

    public static void main(String[] args) {
        ParamCons p1 = new ParamCons(10, 20);
        ParamCons p2 = new ParamCons(30, 40);

        p1.prn();
        p2.prn();
    }
}
