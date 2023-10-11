word = 'hello'
s = input()
i = 0
for letter in s:
    if i < len(word) and letter == word[i]:
        i += 1
if i == len(word):
    print("YES")
else:
    print("NO")
