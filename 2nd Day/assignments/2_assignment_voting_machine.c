#include<stdio.h>

int main() {
    int c1 = 0, c2 = 0, c3 = 0, c4 = 0, opt;

    do {
        printf("Kindly vote for listed candidates: \n");
        printf("Vote for 1st Candidate '1'\n");
        printf("Vote for 2nd Candidate '2'\n");
        printf("Vote for 3rd Candidate '3'\n");
        printf("Vote for 4th Candidate '4'\n");
        printf("Exit voting and calculate result '0'\n");

        scanf("%d", &opt);
        switch (opt) {

            case 1:
                c1++;
                break;

            case 2:
                c2++;
                break;

            case 3:
                c3++;
                break;

            case 4:
                c4++;
                break;

            default:
                printf("Invalid Option!\n");
        }
    } while (opt != 0);
    printf("Candidate 1: %d | ", c1);
    printf("Candidate 2: %d | ", c2);
    printf("Candidate 3: %d | ", c3);
    printf("Candidate 4: %d | \n", c4);

    if (c1 > c2 && c1 > c3 && c1 > c4)
        printf("Candidate A WINNER!!");
    else if (c2 > c1 && c2 > c3 && c2 > c4)
        printf("Candidate B WINNER!!");
    else if (c3 > c1 && c3 > c2 && c3 > c4)
        printf("Candidate C WINNER!!");
    else if (c4 > c2 && c4 > c3 && c4 > c1)
        printf("Candidate D WINNER!!");
    else
        printf("Voting Drew!!");

    return 0;
}