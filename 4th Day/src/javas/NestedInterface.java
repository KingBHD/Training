package javas;

interface OuterI {
    void outerPrn();

    interface InnerI {
        void innerPrn();
    }
}

class LocalInterfaceA implements OuterI, OuterI.InnerI {

    void classPrn() {
        System.out.println("Class prn();");
    }

    public void outerPrn() {
        System.out.println("Outer Prn!");
    }

    public void innerPrn() {
        System.out.println("Inner Prn!");
    }

}

public class NestedInterface {
    public static void main(String[] args) {
        LocalInterfaceA obj = new LocalInterfaceA();
        obj.classPrn();
        obj.outerPrn();
        obj.innerPrn();
    }
}
