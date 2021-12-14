package inheritances;

class MultiLevelA {

    public void prnA() {
        System.out.println("I'm in prn() of MultilevelA");
    }

}

class MultiLevelB extends MultiLevelA {

    public void prnB() {
        System.out.println("I'm in prn() of MultilevelB");
    }

}

class MultiLevelC extends MultiLevelB {

    public void prnC() {
        System.out.println("I'm in prn() of MultiLevelC");
    }

}

public class MultilevelExtends {

    public static void main(String[] args) {
        MultiLevelC m = new MultiLevelC();
        m.prnA();
        m.prnB();
        m.prnC();
    }

}
