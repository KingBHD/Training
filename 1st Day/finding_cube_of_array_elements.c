#import<stdio.h>

void cube(int *x) {
    int y = 0;
    for (int i = 0; i < 5; i++) {
        y = *x;
        printf("%d ", (y * y * y));
        x++;
    }
}

int main() {
    int arr[] = {2, 4, 8, 16, 32};
    cube(&arr[0]);
    return 0;
}