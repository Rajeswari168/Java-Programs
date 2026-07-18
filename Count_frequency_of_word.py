filename = input("Enter file name: ")
search = input("Enter word: ")

f = open(filename, "r")
data = f.read()
f.close()

words = data.split()

count = 0

for word in words:
    if word.lower() == search.lower():
        count += 1

print("Frequency:", count)