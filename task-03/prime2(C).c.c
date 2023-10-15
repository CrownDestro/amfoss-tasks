#include <stdio.h>

void printPrimes(int num) {
    if (num <= 1) {
        printf("No prime numbers.");
        return;
    }

    printf("Prime numbers up to %d are: ", num);

    for (int i = 2; i <= num; i++) {
        int isPrime = 1;

        for (int j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                isPrime = 0;
                break;
            }
        }

        if (isPrime) {
            printf("%d ", i);
        }
    }
}

int main() {
    int n;

    printf("Enter a number: ");
    scanf("%d", &n);

    printPrimes(n);

    return 0;
}
