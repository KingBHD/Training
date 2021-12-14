#include<stdio.h>

int main() {
    char str[] = "String";
    char rev[6];

    for (int i = 0; i <= 6; i++)
        rev[i] = str[6 - i];

    for (int i = 0; i <= 6; i++)
        printf("%c", rev[i]);

    return 0;
}