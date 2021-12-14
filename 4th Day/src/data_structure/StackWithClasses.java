package data_structure;

class Stack {
    int[] item;
    int top = -1;

    public void push(int x) {
        if (top == 4)
            System.out.println("Overflow");

        top++;
        item[top] = x;
        System.out.println(x + " Pushed!");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            int e = item[top];
            System.out.println(e + " Pop-ed!");
            top--;
            return e;
        }
    }

    public void list() {
        int i = top;
        while (i >= 0) {
            System.out.println(item[i]);
            i--;
        }
    }
}

public class StackWithClasses {
    public static void main(String[] args) {
//        Stack obj1 = new Stack();
//
//        obj1.push();
//        obj1.push();
//        obj1.list();
//        obj1.pop();
//        obj1.list();

        Stack obj1 = new Stack();
        Stack obj2 = new Stack();

        obj1.push(10);
        obj1.push(20);
        obj1.push(30);

        obj1.list();

        obj2.push(obj1.pop());
        obj2.push(obj1.pop());
        obj2.push(obj1.pop());

        obj2.list();
    }
}
