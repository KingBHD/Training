#include<stdio.h>
#include "voter.h"

void startMachine();

int main() {
    startMachine();
    return 0;
}

void startMachine() {
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c;

    do {
        printf("\n\t------The Voting Machine------\n");
        printf("(1)\tStart casting vote!\n");
        printf("(2)\tView Result\n");
        printf("(3)\tCast Winner\n");
        printf("(4)\tReset Voting\n");
        printf("(0)\tExit\n\n\t\t");
        scanf("%d",&c);

        switch(c)
        {
            case 1:
                castVote(&c1, &c2, &c3, &c4);
                break;
            case 2:
                showResult(c1, c2, c3, c4);
                break;
            case 3:
                drawWinner(c1, c2, c3, c4);
                break;
            case 4:
                main();
                break;
            case 0:
                exit(0);
            default:
                printf("Wrong Choice...Please Try Again\n");
        }
    } while (c != 0);
}
