def sum_of_multiples(N):
    N -= 1
    sum_3 = (3 * (N // 3) * (N // 3 + 1)) // 2
    sum_5 = (5 * (N // 5) * (N // 5 + 1)) // 2
    sum_15 = (15 * (N // 15) * (N // 15 + 1)) // 2
    total_sum = sum_3 + sum_5 - sum_15
    return total_sum

T = int(input())

for _ in range(T):
    N = int(input())
    result = sum_of_multiples(N)
    print(result)
