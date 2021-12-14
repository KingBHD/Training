package classes;

public class MethodOverload {
    void prt() {
        System.out.println("prt without args");
    }

    void prt(int i) {
        System.out.println("prt with one int arg");
    }

    void prt(int i, int j) {
        System.out.println("prt with two int args");
    }

    void prt(int i, int j, int k) {
        System.out.println("prt with three int args");
    }

    void prt(int i, float j) {
        System.out.println("prt with two args, int and float");
    }

    void prt(int i, char j) {
        System.out.println("prt with two args, int and char");
    }

    public static void main(String[] args) {
        MethodOverload m = new MethodOverload();
        m.prt();
        m.prt(1);
        m.prt(1, 2);
        m.prt(1, 2, 3);
        m.prt(1, 2.0f);
        m.prt(1, 'a');
    }
}
