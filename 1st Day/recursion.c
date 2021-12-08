#import<stdio.h>

int fact(int n) {
    int f;
    if (n > 1) {
        f = n * fact(n - 1);
        return f;
    }
    return 1;
}

int main() {
    int f;
    f = fact(5);
    printf("%d", f);
    return 0;
}