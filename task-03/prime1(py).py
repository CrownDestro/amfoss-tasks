def is_prime(n):

  if n < 2:
    return False
  for i in range(2, int(n**0.5) + 1):
    if n % i == 0:
      return False
  return True
def print_primes(n):
  for i in range(2, n + 1):
    if is_prime(i):
      print(i)
if __name__ == "__main__":
  n = int(input("Enter a number: "))
  print_primes(n)