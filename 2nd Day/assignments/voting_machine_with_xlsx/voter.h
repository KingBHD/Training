#include <stdio.h>
#include <stdlib.h>

void showResult(int c1, int c2, int c3, int c4) {
    printf("Candidate 1: %d | ", c1);
    printf("Candidate 2: %d | ", c2);
    printf("Candidate 3: %d | ", c3);
    printf("Candidate 4: %d\n", c4);
}

void castVote(int *c1, int *c2, int *c3, int *c4) {
    int opt = 0;
    do {
        printf("Kindly vote for listed candidates: \n");
        printf("1 - To vote for 1st Candidate\n");
        printf("2 - To vote for 2nd Candidate\n");
        printf("3 - To vote for 3rd Candidate\n");
        printf("4 - To vote for 4th Candidate\n");
        printf("0 - To exit from voting\n");

        scanf("%d", &opt);
        switch (opt) {

            case 1:
                (*c1)++;
                break;

            case 2:
                (*c2)++;
                break;

            case 3:
                (*c3)++;
                break;

            case 4:
                (*c4)++;
                break;
            case 0:
                break;
            default:
                printf("Wrong option, kindly try again!\n");
        }
    } while (opt != 0);
}

void drawWinner(int c1, int c2, int c3, int c4) {
    if (c1 > c2 && c1 > c3 && c1 > c4)
        printf("Candidate 1 WINNER!!");
    else if (c2 > c1 && c2 > c3 && c2 > c4)
        printf("Candidate 2 WINNER!!");
    else if (c3 > c1 && c3 > c2 && c3 > c4)
        printf("Candidate 3 WINNER!!");
    else if (c4 > c2 && c4 > c3 && c4 > c1)
        printf("Candidate 4 WINNER!!");
    else
        printf("Voting Draw!!");
}
