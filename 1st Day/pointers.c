#import<stdio.h>

void swap(int *x, int *y) {
    int t;
    t = *x;
    *x = *y;
    *y = t;
}

int main() {
    int i = 10, j = 20;

    printf("Before: i = %d j = %d\n", i, j);

    swap(&i, &j);

    printf("After: i = %d j = %d\n", i, j);
    return 0;
}