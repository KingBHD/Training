class Queue {
    int[] a = new int[5];
    int r, f;

    Queue() {
        r = -1;
        f = -1;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (f == -1) {
                f = 0;
            }
            if (r == -1) {
                r = 0;
            } else {
                r++;
            }
            a[r] = element;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int element = a[f];
            if (f == 4) {
                f = 0;
            } else {
                f++;
                if (f == r) {
                    f = r = -1;
                }
            }
            return element;
        }
    }

    public boolean isEmpty() {
        return r == f;
    }

    public boolean isFull() {
        return f == 4;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        for (int i = f; i <= r; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

class QueueWithClasses {

    public static void main(String[] args) {
        Queue q1 = new Queue();
        Queue q2 = new Queue();

        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);

        q2.enqueue(40);
        q2.enqueue(50);
        q2.enqueue(60);

        System.out.println("Displaying elements from q1");
        q1.display();
        System.out.println("Displaying elements from q2");
        q2.display();
    }
}

