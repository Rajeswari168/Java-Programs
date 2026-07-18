filename = input("Enter file name: ")
text = input("Enter text: ")

f = open(filename, "a")
f.write(text + "\n")
f.close()

print("Text appended successfully.")