filename = input("Enter file name: ")
n = int(input("Enter number of lines: "))

f = open(filename, "r")

for i in range(n):
    line = f.readline()
    if line == "":
        break
    print(line, end="")

f.close()