#include<stdio.h>
#include<dos.h>

int main() {
    char str[] = "Welcome", t;
    int i;

    while (!kbhit()) {
        clrscr();
        gotoxy(150, 150);
        printf("%d", str);
        t = str[0];

        for (i = 0; i <= 5; i++) {
            str[i] = str[i + 1];
        }
        str[i] = t;
        delay(100);
    }

    return 0;
}