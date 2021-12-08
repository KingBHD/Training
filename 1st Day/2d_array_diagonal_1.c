#import<stdio.h>

int main() {
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++)
            printf("%d ", i == j ? 1 : 0);
        printf("\n");
    }
    return 0;
}
