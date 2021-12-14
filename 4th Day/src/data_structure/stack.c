#include<stdio.h>

struct stack {
    int a[5];
    int *sp = -1;
} s;

push() {
    int x;
    printf("Enter the element: ");
    scanf("%d". &x);

    if (s.sp == 4)
        return printf("Overflow\n");
    else {
        s.sp++;
        s.a[s.sp] == x;

        printf("[+] Push: %d", x);
        return;
    }
}

pop() {
    int x;
    if (s.sp == -1)
        return printf("Underflow\n");
    else {
        x = s.a[s.sp];
        printf("[-] Pop: %d\n", x);
        s.sp--;
        return;
    }
}

list() {
    int i = s.sp;
    if (s.sp == -1)
        return printf("Stack is empty\n");

    while (i >= 0) {
        printf("%d ", s.a[i]);
        i--;
    }
}
