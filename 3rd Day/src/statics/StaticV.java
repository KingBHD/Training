package statics;

import java.util.Scanner;

public class StaticV {
    static int c;
    int x, y;

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

    void count() {
        System.out.println("c = " + c);
    }
}

class MaV {
    public static void main(String[] args) {
        StaticV s1 = new StaticV();
        StaticV s2 = new StaticV();
        StaticV s3 = new StaticV();

        System.out.println("Before calling get method for any Obj");
        s1.count();
        s2.count();
        s3.count();

        System.out.println("Enter the value of Obj1");
        s1.get();
        s1.count();
        s2.count();
        s3.count();

        System.out.println("Enter the value of Obj2");
        s2.get();
        s1.count();
        s2.count();
        s3.count();

        System.out.println("Enter the value of Obj3");
        s3.get();
        s1.count();
        s2.count();
        s3.count();

        System.out.println("Output");
        System.out.println("Obj1");
        s1.prn();
        System.out.println("Obj2");
        s2.prn();
        System.out.println("Obj3");
        s3.prn();
    }
}