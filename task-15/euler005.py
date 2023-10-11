import math
T = int(input())
while T>0:
    lcm=1
    n = int(input())
    for i in range(1, n+1):
        lcm = (lcm * i) // math.gcd(lcm, i)
    print(lcm)
    T=T-1