filename = input("Enter file name: ")

f = open(filename, "r")
data = f.read()
print(data)
f.close()