n = int(input())
travel_times = list(map(int,input().split()))

min_time = float('int')
count = 0

for time in travel_times:
    min_time = min(min_time, time)
for time in travel_times:
    if time == min_time:
        count += 1

if count > 1:
    print("Still Aetheria")
else:
    print(travel_times.index(min_time) + 1)
