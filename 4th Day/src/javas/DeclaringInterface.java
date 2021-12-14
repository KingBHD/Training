package javas;

interface DeclareFace {
    int x = 10, y = 20;

    void prn();
}

interface DeclareFace2 {
    int x = 30, y = 40;

    void prn();
}

class DeclaringClassA implements DeclareFace, DeclareFace2 {

    public void classPrn() {
        System.out.println("I;m in classPrn()");
    }

    public void prn() {
        System.out.println("I;m in prn()");
    }
}

public class DeclaringInterface {
    public static void main(String[] args) {
        DeclaringClassA obj = new DeclaringClassA();
        obj.prn();

        // System.out.println("x = " + obj.x + " y = " + obj.y);
        // System.out.println(obj.sumValue);
    }
}
