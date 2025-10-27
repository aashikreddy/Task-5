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

1️⃣ Deposit
2️⃣ Withdraw
3️⃣ Apply Interest
4️⃣ Show Balance
5️⃣ Show Transaction History
0️⃣ Exit
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

## 📄 Deliverables
- Java source files (`.java`)
- This `README.md`
- (Optional) Screenshots of successful execution
- GitHub repository link

---

## 🧠 Interview Prep Questions
1. What is inheritance in Java?  
2. Why use the `this` keyword?  
3. What is method overriding vs overloading?  
4. What is object instantiation?  
5. Explain single vs multiple inheritance.  
6. What is encapsulation?  
7. What is constructor overloading?  
8. Can we override static methods?  
9. What is runtime polymorphism?  
10. Difference between class and object?

---

## 🧑‍💻 Author
**Aashik Reddy**  
Java Developer Internship — Task 5  
📅 2025  

---

## 🪪 License
This project is licensed under the **MIT License**.
