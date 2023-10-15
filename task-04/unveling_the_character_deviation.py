# Function to calculate the number of differing indices using ASCII values
def count_differing_indices(s):
    word = "amfoss"
    count = 0
    for i in range(len(s)):
        if ord(s[i]) != ord(word[i]):
            count += 1
    return count

# Read the number of test cases
t = int(input().strip())  # Read the number of test cases from input

# Process each test case
for _ in range(t):
    s = input().strip()  # Read the input string for each test case
    differing_indices = count_differing_indices(s)
    print(differing_indices)
