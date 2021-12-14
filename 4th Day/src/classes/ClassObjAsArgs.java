package classes;

import java.util.Scanner;

public class ClassObjAsArgs {
    private int x, y;

    void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x and y");
        x = sc.nextInt();
        y = sc.nextInt();
    }

    void prn() {
        System.out.println("x = " + x + " y = " + y);
    }

    void sumOfObj(ClassObjAsArgs obj11, ClassObjAsArgs obj12) {
        x = obj11.x + obj12.x;
        y = obj11.y + obj12.y;
    }
}

class MaC {
    public static void main(String[] args) {
        ClassObjAsArgs obj1 = new ClassObjAsArgs();
        ClassObjAsArgs obj2 = new ClassObjAsArgs();
        ClassObjAsArgs obj3 = new ClassObjAsArgs();

        System.out.println("Enter x and y for obj1");
        obj1.get();
        System.out.println("Enter x and y for obj2");
        obj2.get();

        obj3.sumOfObj(obj1, obj2);

        System.out.println("Output");
        System.out.println("Obj1");
        obj1.prn();
        System.out.println("Obj2");
        obj2.prn();
        System.out.println("Obj3");
        obj3.prn();
    }
}
