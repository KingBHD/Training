package constructors;

import java.util.Scanner;

public class SimpleCons {

    private final int i;
    private final int j;

    SimpleCons() {
        System.out.println("I am in simple constructor");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter i and j");
        i = sc.nextInt();
        j = sc.nextInt();
    }

    public void prn() {
        System.out.println("i = " + i + " j = " + j);
    }

    public static void main(String[] args) {
        SimpleCons sc = new SimpleCons();
        sc.prn();
    }
}
