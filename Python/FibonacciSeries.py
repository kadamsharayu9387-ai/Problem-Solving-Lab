n = int(input("Enter number of terms: "))

first = 0
second = 1

print("Fibonacci Series:")

for i in range(n):
    print(first, end=" ")
    
    next = first + second
    first = second
    second = next
