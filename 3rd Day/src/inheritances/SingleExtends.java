package inheritances;

class SingleA {

    public void prnA() {
        System.out.println("I'm in prn() of SingleA");
    }

}

class SingleB extends SingleA {

    public void prnB() {
        System.out.println("I'm in prn() of SingleB");
    }

}

public class SingleExtends {

    public static void main(String[] args) {
        SingleB m = new SingleB();
        m.prnA();
        m.prnB();
    }

}
