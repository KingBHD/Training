package inheritances;

class HybridA {

    public void prnA() {
        System.out.println("I'm in prn() of HybridA");
    }

}

class HybridB extends HybridA {

    public void prnB() {
        System.out.println("I'm in prn() of HybridB");
    }

}

class HybridC extends HybridB {

    public void prnC() {
        System.out.println("I'm in prn() of HybridC");
    }

}

class HybridD extends HybridB {

    public void prnD() {
        System.out.println("I'm in prn() of HybridD");
    }

}

public class HybridExtends {

    public static void main(String[] args) {
        HybridC m1 = new HybridC();
        HybridD m2 = new HybridD();
    }

}
