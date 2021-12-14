package javas;

interface I1 {
    void prn1A();
}

interface I2 {
    void prn2B();
}

interface I3 extends I1, I2 {
    void prn3C();
}

class FaceClassA implements I3 {

    void prn() {
        System.out.println("prnA");
    }

    public void prn1A() {
        System.out.println("prn1");
    }
    public void prn2B() {
        System.out.println("prn1");
    }
    public void prn3C() {
        System.out.println("prn1");
    }
}

public class InterMainClass {

    public static void main(String[] args) {
        FaceClassA obj = new FaceClassA();
        obj.prn();
        obj.prn1A();
        obj.prn2B();
        obj.prn3C();
    }
}
