package statics;

import java.util.*;

public class StaticM {
    int x, y;
    static int c;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();
        c++;
    }

    void prn() {
        System.out.println("x = " + x + " y = " + y);
    }

    static void count() {
        System.out.println("c = " + c);
    }
}

class MaM {
    public static void main(String[] args) {
        StaticM s1 = new StaticM();
        StaticM s2 = new StaticM();
        StaticM s3 = new StaticM();

        StaticM.count();
        s1.get();

        StaticM.count();
        s2.get();

        StaticM.count();
        s3.get();

        System.out.println("Output");
        System.out.println("Obj1");
        s1.prn();
        System.out.println("Obj2");
        s2.prn();
        System.out.println("Obj3");
        s3.prn();
    }
}
