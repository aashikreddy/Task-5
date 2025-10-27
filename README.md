# 🏦 Bank Account Simulation

## 📘 Overview
This project simulates **basic banking operations** using **Java Object-Oriented Programming (OOP)** concepts such as **classes**, **inheritance**, and **method overriding**.  

It allows users to perform real-world banking actions like depositing, withdrawing, and applying interest, while maintaining a **transaction history**.

---

## 🧩 Features
- Create and manage bank accounts
- Deposit and withdraw money
- Apply interest for savings accounts
- View transaction history
- Enforces minimum balance policy
- Demonstrates OOP principles:
  - **Encapsulation**
  - **Inheritance**
  - **Polymorphism**
  - **Method Overriding**

---

## 🏗️ Project Structure
```
BankAccountSimulation/
│
├── Account.java          # Base class for account operations
├── SavingsAccount.java   # Derived class with interest and withdrawal rules
└── Main.java             # Entry point with menu-driven interaction
```

---

## ⚙️ How It Works
1. **`Account` class**
   - Handles deposit, withdrawal, and transaction tracking.
2. **`SavingsAccount` class**
   - Inherits from `Account`.
   - Adds interest calculation and minimum balance enforcement.
3. **`Main` class**
   - Provides a user interface for interacting with the account.

---

## 🖥️ Sample Output
```
🏦 Welcome to Java Bank Simulation!
Enter Account Holder Name: Aashik
Enter Account Number: 12345

1️. Deposit
2️. Withdraw
3️. Apply Interest
4️. Show Balance
5️. Show Transaction History
0️. Exit
Enter your choice: 1
Enter amount to deposit: 1000
✅ Deposited ₹1000 successfully.

Enter your choice: 3
💹 Interest of ₹300.0 added to balance.

Enter your choice: 5
📜 Transaction History:
Account created with balance: 5000.0
Deposited: 1000.0 | Balance: 6000.0
Interest applied: 300.0 | New Balance: 6300.0
```

---

## 🚀 How to Run

### Option 1 — Using VS Code
1. Open **VS Code** and create a new folder, e.g., `BankAccountSimulation`.
2. Add the three files:
   - `Account.java`
   - `SavingsAccount.java`
   - `Main.java`
3. Run the project:
   - Open the terminal in VS Code.
   - Execute:
     ```bash
     javac *.java
     java Main
     ```

### Option 2 — Using Command Prompt
1. Navigate to the project directory:
   ```bash
   cd BankAccountSimulation
   ```
2. Compile all Java files:
   ```bash
   javac *.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

---

## 💡 Concepts Demonstrated
| Concept | Explanation |
|----------|-------------|
| **Class & Object** | Used to model bank accounts |
| **Inheritance** | `SavingsAccount` extends `Account` |
| **Method Overriding** | Custom `withdraw()` method in `SavingsAccount` |
| **Encapsulation** | Account data is protected through methods |
| **Polymorphism** | Parent class references can point to child objects |

---

## 🧑‍💻 Author
**Aashik Reddy**    

---

## 🪪 License
This project is licensed under the **MIT License**.
