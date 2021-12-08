#import<stdio.h>

int gr(int *x) {
    int y = 0;
    for (int i = 0; i < 5; i++) {
        if (*x > y) {
            y = *x;
        }
        x++;
    }
    return y;
}

int main() {
    int arr[] = {2, 9, 22, 8, 2};
    printf("%d", gr(&arr[0]));
    return 0;
}