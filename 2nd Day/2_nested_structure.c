#include<stdio.h>

struct performance {
    int m1, m2;
    char gr[5];
};

struct stud {
    int roll;
    char name[10];
    int age;
    struct performance p;
};

int main() {
    struct stud s;
    printf("Enter entry of student\n");
    printf("Enter roll no:");
    scanf("%d", &s.roll);

    printf("Enter Name:");
    scanf("%s", &s.name);

    printf("Enter Age:");
    scanf("%d", &s.age);

    printf("Enter Mark 1:");
    scanf("%d", &s.p.m1);

    printf("Enter Mark 2:");
    scanf("%d", &s.p.m2);

    printf("Enter Grade:");
    scanf("%s", &s.p.gr);

    printf("Name: %s\n", s.name);
    printf("Roll: %d\n", s.roll);
    printf("Age: %d\n", s.age);
    printf("M1: %d\n", s.p.m1);
    printf("M2: %d\n", s.p.m2);
    printf("Grade: %s\n", s.p.gr);
    return 0;
}