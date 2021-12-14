package abstracts;

abstract class AB {
    void walk() {
        System.out.println("I can walk");
    }

    void talk() {
        System.out.println("I can talk");
    }

    abstract void swim();
    abstract void drive_a_car();
}

class AbstractExtend extends AB {
    void prn() {
        System.out.println("I'm in prn()");
    }

    void swim() {
        System.out.println("I can can swimming");
    }

    void drive_a_car() {
        System.out.println("I can drive a car");
    }
}

public class SimpleAbstract {
    public static void main(String[] args) {
        AbstractExtend a = new AbstractExtend();
        a.prn();
        a.talk();
        a.walk();
        a.drive_a_car();
    }
}
