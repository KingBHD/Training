package inheritances.supers;

class ArgsA {

    int x, y;

    ArgsA(int a, int b) {
        x = a;
        y = b;
    }

    public void prnA() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

class ArgsB extends ArgsA {

    int x, y;

    ArgsB(int a, int b, int c, int d) {
        super(a * 2, b * 2);
        x = c;
        y = d;
    }

    public void prnB() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

public class SuperWithArgs {

    public static void main(String[] args) {
        ArgsB obj = new ArgsB(1, 2, 3, 4);

        obj.prnA();
        obj.prnB();

    }

}
