#include <stdio.h>
#include <stdlib.h>
int is_prime(int n) {
  if (n < 2) {
    return 0;
  }
  for (int i = 2; i <= (int)sqrt(n); i++) {
    if (n % i == 0) {
      return 0;
    }
  }
  return 1;
}
void print_primes(int n) {
  for (int i = 2; i <= n; i++) {
    if (is_prime(i)) {
      printf("%d\n", i);
    }
  }
}
int main() {
  int n;
  printf("Enter a number: ");
  scanf("%d", &n);
  print_primes(n);
  return 0;
}