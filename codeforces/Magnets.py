magnets = int(input())
counter = 1

magnet_positions = [input() for _ in range(magnets)]

for i in range(magnets - 1):
    if magnet_positions[i][1] == magnet_positions[i + 1][0]:
        counter += 1

print(counter)