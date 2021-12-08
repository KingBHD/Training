#import<stdio.h>

int main() {
    int arr[3][3] = {3, 6, 2, 4, 7, 1, 9, 8, 5};

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {

            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    if (arr[i][j] < arr[x][y]) {
                        int swap = arr[i][j];
                        arr[i][j] = arr[x][y];
                        arr[x][y] = swap;
                    }

                }
            }
        }
    }

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++)
            printf("%d ", arr[i][j]);
        printf("\n");
    }

    return 0;
}