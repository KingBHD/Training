#import<stdio.h>

int sum(int a, int b) {
    return a + b;
}

int main() {
    int c;
    c = sum(5, 3);
    printf("%d", c);
    return 0;
}