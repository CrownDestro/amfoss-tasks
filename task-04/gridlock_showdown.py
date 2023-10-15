def park(grid):
    
    for i in range(3):
        if grid[i][0] == grid[i][1] == grid[i][2] != '.':
            return grid[i][0]
        if grid[0][i] == grid[1][i] == grid[2][i] != '.':
            return grid[0][i]
    if grid[0][0] == grid[1][1] == grid[2][2] != '.':
        return grid[0][0]
    if grid[0][2] == grid[1][1] == grid[2][0] != '.':
        return grid[0][2]

    return "DRAW"

# for taking number of inputs
t = int(input())

for _ in range(t):
    grid = [input() for _ in range(3)]

    winner=park(grid)
    print(winner)
