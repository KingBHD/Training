package javas;

interface LocalPrn {
    void prn();
}

class InterClassB implements FacePrn, LocalPrn {

    public void prn() {
        System.out.println("I'm in prn()");
    }

    public void prn1() {
        System.out.println("I'm in prn1()");
    }

    public void prn2() {
        System.out.println("I'm in prn2()");
    }
}

class InterfaceEg2 {

    public static void main(String[] args) {
        InterClassB obj = new InterClassB();
        obj.prn();
        obj.prn1();
        obj.prn2();
    }
}