# Student Fee Management System

A simple **console-based Java application** developed to manage student fee records. This system allows users to register a student, calculate total fees based on modules, make payments, and track outstanding balances. This project was developed as part of a university assignment for the module CSP3341 Programming Languages and Paradigms.

---

## 🚀 Features

- Register a student with validation
- Calculate total fees based on number of modules
- View student fee details
- Make payments with validation checks
- View outstanding (due) amount
- Menu-driven console interface
- Error handling using exceptions

---

## 🛠️ Technologies Used

- Java
- OOP Concepts
- Exception Handling
- Scanner (for user input)

---

## ⚙️ System Functionality

### 1. Register Student
- Enter:
  - Student ID (must be exactly 8 digits)
  - Student Name (letters only)
  - Number of Modules (1–4)
- Automatically calculates total fee

### 2. View Fee Details
Displays:
- Student ID
- Student Name
- Number of Modules
- Fee per Module
- Total Fee
- Paid Amount

### 3. Pay Fee
- Enter payment amount
- Validations:
  - Must be greater than 0
  - Cannot exceed total fee
- Updates paid amount

### 4. View Due Amount
- Displays remaining balance to be paid

### 5. Exit
- Closes the application

---

## 💰 Fee Structure

- **Fee per Module:** 160,000.0  
- **Maximum Modules:** 4  

---

## 📁 Project Structure
│──bin
│──lib
│──src
  │───StudentFeeManagement.java # Main Java program file
  │───StudentFeeManagement.class

---

## ▶️ How to Run

1. Open terminal or command prompt  
2. Navigate to project directory  
3. Compile the program:
   javac StudentFeeManagement.java  

4. Run the program:
   java StudentFeeManagement  

---

## 🔒 Validation & Error Handling

- Student ID must be exactly 8 digits
- Student name must contain only letters
- Module count must be between 1 and 4
- Payment must be numeric and greater than zero
- Prevents overpayment
- Handles invalid input using try-catch blocks

---

## ⚠️ Limitations

- Stores only one student at a time (no database)
- Data is not persistent (resets when program restarts)
- Console-based UI (no graphical interface)

---

## 🔮 Future Improvements

- Add support for multiple students
- Integrate database (MySQL)
- Build a GUI (JavaFX or Swing)
- Add login/authentication system
- Generate payment receipts

---

## 📄 License

This project is developed for academic purposes only.
