number = int(input("Enter a number: "))

if number <= 1:
    print(number, "is NOT a prime number.")
else: 
    is_prime = True

    for i in range(2, number):
                
        if number % i == 0:
            is_prime = False
            break  

    if is_prime:
        print(number, "is a PRIME number.")
    else:
        print(number, "is NOT a prime number.")
