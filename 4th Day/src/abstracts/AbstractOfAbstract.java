package abstracts;

abstract class ABC {

    void walk() {
        System.out.println("I can walk");
    }

    void talk() {
        System.out.println("I can talk");
    }

    public abstract void swim();
}

abstract class DEF extends ABC {

    public void drive_a_bicycle() {
        System.out.println("I can drive a bicycle");
    }

    public abstract void drive_a_car();
}

class ExtendedFromTwoAbstractClasses extends DEF {

    public void prn() {
        System.out.println("I'm in prn()");
    }

    public void swim() {
        System.out.println("I can swim");
    }

    public void drive_a_car() {
        System.out.println("I can drive a car");
    }
}

public class AbstractOfAbstract {
    public static void main(String[] args) {
        ExtendedFromTwoAbstractClasses e = new ExtendedFromTwoAbstractClasses();
        e.prn();
        e.walk();
        e.talk();
        e.swim();
        e.drive_a_bicycle();
        e.drive_a_car();
    }
}
