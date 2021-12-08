#import<stdio.h>

int swap(int *a, int *b) {
    int *t;
    t = a;
    a = b;
    b = t;
    return 0;
}

int main() {
    int *i, *j;

    swap(&i, &j);

    printf("%d %d", *i, *j);
    return 0;
}