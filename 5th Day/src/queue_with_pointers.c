#include<stdio.h>
#include<stdlib.h>
#define MAX_SIZE 5

struct Queue{
    int front;
    int item[MAX_SIZE];
    int rear;
};

int main() {
    struct Queue *q = NULL;
    int choice, item;

    (*q).front = 0;
    (*q).rear = -1;

    while(1){
        printf("\n1. Enqueue\n2. Dequeue\n3. Display\n4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch(choice){
            case 1:
                if((*q).rear == MAX_SIZE-1){
                    printf("Queue is full\n");
                    break;
                }
                printf("Enter the item to be inserted: ");
                scanf("%d", &item);
                (*q).rear++;
                (*q).item[(*q).rear] = 1;
                break;
            case 2:
                if((*q).front == -1){
                    printf("Queue is empty\n");
                    break;
                }
                printf("Deleted item: %d\n", (*q).item[(*q).front]);
                (*q).front++;
                break;
            case 3:
                if((*q).front == -1){
                    printf("Queue is empty\n");
                    break;
                }
                printf("Queue: ");
                for(int i=(*q).front; i<=(*q).rear; i++){
                    printf("%d ", (*q).item[i]);
                }
                printf("\n");
                break;
            case 4:
                exit(0);
            default:
                printf("Invalid choice\n");
        }
    }
    return 0;
}
