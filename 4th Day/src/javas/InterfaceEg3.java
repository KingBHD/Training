package javas;

class InterClass1 implements FacePrn {

    public void prn() {
        System.out.println("I'm in prn() in class 1");
    }

    public void prnA() {
        System.out.println("I'm in prnA()");
    }
}

class InterClass2 implements FacePrn {

    public void prn() {
        System.out.println("I'm in prn() in class 2");
    }

    public void prnB() {
        System.out.println("I'm in prnA()");
    }
}

class InterfaceEg3 {

    public static void main(String[] args) {
        InterClass1 obj1 = new InterClass1();
        InterClass2 obj2 = new InterClass2();

        obj1.prn();
        obj2.prn();

        obj1.prnA();
        obj2.prnB();
    }
}