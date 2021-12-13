#include<stdio.h>

int main() {
    char ch;
    FILE *fp;

    fp = fopen("C:\\Users\\KINGBHD\\Desktop\\text.txt", "w");
    while (ch != '9') {
        scanf("%c", &ch);
        ch = fputc(ch, fp);
    }
    fclose(fp);

    fp = fopen("C:\\Users\\KINGBHD\\Desktop\\text.txt", "r");
    ch = ' ';
    while (ch != EOF) {
        ch = fgetc(fp);
        printf("%c", ch);
    }
    fclose(fp);
    return 0;
}