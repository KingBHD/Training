package inheritances.supers;

class A {

    int x, y;

    A() {
        x = 10;
        y = 20;
    }

    public void prn() {
        System.out.println("A");
    }

    public void prnA() {
        System.out.println("A from prnA()");
    }
}

class B extends A {

    public void prn() {
        System.out.println("B");
    }

    public void prnB() {
        prn();
        super.prn();
        super.prnA();

        System.out.println("x = " + super.x + " y = " + super.y);
    }
}

public class SuperM {

    public static void main(String[] args) {
        B obj = new B();
        obj.prnB();
    }

}
