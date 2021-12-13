#include<stdio.h>

int main() {
    char str[] = "This is a String";
    int i = 0, j;

    while (str[i] != '\0') {
        if (str[i] > 96 && str[i] < 123)
            str[i] = str[i] - 32;
        i++;
    }

    for (j = 0; j < i; j++)
        printf("%c", str[j]);

    return 0;
}