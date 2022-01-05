
class Queue {
    int a = new int[5];
    int r, f;

    Queue() {
        r = -1;
        f = -1;
    }

    public void enqueue() {
        System.out.print("Enter an element: ");
        int element = sc.nextInt();
        if isFull() {
            System.out.println("Queue is full");
        } else {
            if f == -1 {
                f = 0;
            }
            if r == a.length - 1 {
                r = 0;
            } else {
                r++;
            }
            a[r] = element;
        }
    }

    public int dequeue() {
        if isEmpty() {
            System.out.println("Queue is empty");
            return -1;
        } else {
            int element = a[f];
            if f == a.length - 1 {
                f = 0;
            } else {
                f++;
            }
            return element;
        }
    }

    public boolean isEmpty() {
        return r == f;
    }

    public boolean isFull() {
        return f == a.length;
    }

    public void print() {
        for (int i = r; i < f; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

