package classes;

import java.util.Scanner;

public class ReturningObj {
    private int x, y;

    static ReturningObj sumOfObj(ReturningObj obj11, ReturningObj obj12) {
        ReturningObj obj = new ReturningObj();
        obj.x = obj11.x + obj12.x;
        obj.y = obj11.y + obj12.y;
        return obj;
    }

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    void prn() {
        System.out.println("x = " + x + " y = " + y);
    }
}

class MaR {
    public static void main(String[] args) {
        ReturningObj obj1 = new ReturningObj();
        ReturningObj obj2 = new ReturningObj();
        ReturningObj obj3;

        System.out.println("Enter values for obj1");
        obj1.get();
        System.out.println("Enter values for obj2");
        obj2.get();

        obj3 = ReturningObj.sumOfObj(obj1, obj2);

        System.out.println("Output");
        System.out.println("Obj1");
        obj1.prn();
        System.out.println("Obj2");
        obj2.prn();
        System.out.println("Obj3");
        obj3.prn();
    }
}
