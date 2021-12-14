package javas;

interface FacePrn {

    void prn();

}

class InterClassA implements FacePrn {

    public void prn() {
        System.out.println("I'm in prn()");
    }

    public void prnA() {
        System.out.println("I'm in prnA()");
    }
}

class InterfaceEg {

    public static void main(String[] args) {
        InterClassA obj = new InterClassA();
        obj.prn();
        obj.prnA();
    }
}