filename = input("Enter file name: ")

f = open(filename, "r")

lines = []

for line in f:
    lines.append(line.strip())

f.close()

print(lines)