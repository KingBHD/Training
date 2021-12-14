package inheritances;

class HierarchicalA {

    public void prnA() {
        System.out.println("I'm in prn() of HierarchicalA");
    }

}

class HierarchicalB extends HierarchicalA {

    public void prnB() {
        System.out.println("I'm in prn() of HierarchicalB");
    }

}

class HierarchicalC extends HierarchicalA {

    public void prnC() {
        System.out.println("I'm in prn() of HierarchicalC");
    }

}

public class HierarchicalExtends extends HierarchicalC {

    public static void main(String[] args) {
        HierarchicalB m1 = new HierarchicalB();
        HierarchicalC m2 = new HierarchicalC();

        m1.prnA();
        m1.prnB();

        m2.prnA();
        m2.prnC();
    }

}
