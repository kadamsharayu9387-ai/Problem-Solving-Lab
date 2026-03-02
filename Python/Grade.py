balance = 1000.0  

while True:
    print("\n===== ATM Machine =====")
    print("1. Check Balance")
    print("2. Deposit")
    print("3. Withdraw")
    print("4. Exit")

    choice = input("Enter your choice: ")

    if choice == "1":
        print(f"Your current balance is: ${balance}")

    elif choice == "2":
        deposit = float(input("Enter amount to deposit: "))
        if deposit > 0:
            balance += deposit
            print("Deposit successful!")
        else:
            print("Invalid deposit amount.")

    elif choice == "3":
        withdraw = float(input("Enter amount to withdraw: "))
        if withdraw > 0 and withdraw <= balance:
            balance -= withdraw
            print("Withdrawal successful!")
        else:
            print("Invalid or insufficient balance.")

    elif choice == "4":
        print("Thank you for using ATM. Goodbye!")
        break

    else:
        print("Invalid choice. Please try again.")
