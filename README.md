# UC11 – Object-Oriented Palindrome Service

## 📌 Goal
Encapsulate palindrome validation logic inside a dedicated service class using Object-Oriented Programming principles.

---

## 📝 Description

This program demonstrates palindrome validation using proper OOP design.

The palindrome logic is separated into a `PalindromeService` class, while the main class handles program execution.

This improves:

- Reusability
- Readability
- Maintainability
- Separation of concerns

---

## 🏗 Project Structure

UseCase11PalindromeCheckerApp.java

Contains:
- Main class → Handles execution
- PalindromeService class → Contains business logic

---

## 🔁 Flow of Execution

1. Create `PalindromeService` object
2. Call `checkPalindrome()` method
3. Method compares characters from both ends
4. Return true if palindrome, otherwise false

---

## 🧠 Key Concepts Used (OOPS)

### 1️⃣ Encapsulation
The palindrome logic is hidden inside the `PalindromeService` class.
class PalindromeService {
public boolean checkPalindrome(String input) { ... }
}

The main class does not know how the logic works internally.

---

### 2️⃣ Single Responsibility Principle (SRP)

- `UseCase11PalindromeCheckerApp` → Handles application execution
- `PalindromeService` → Handles palindrome validation

Each class has only one responsibility.

---

### 3️⃣ Separation of Concerns

Business logic and execution logic are separated for cleaner architecture.

---

## 🔎 Algorithm Used

Two-pointer technique:

1. Initialize:

The main class does not know how the logic works internally.

---

### 2️⃣ Single Responsibility Principle (SRP)

- `UseCase11PalindromeCheckerApp` → Handles application execution
- `PalindromeService` → Handles palindrome validation

Each class has only one responsibility.

---

### 3️⃣ Separation of Concerns

Business logic and execution logic are separated for cleaner architecture.

---

## 🔎 Algorithm Used

Two-pointer technique:

1. Initialize:int start = 0;
   int end = input.length() - 1;


2. Compare characters while moving inward:

while (start < end)


3. If mismatch → return false
4. If loop completes → return true

---

## 🗂 Data Structure Used

- **String**
- Two-pointer traversal (internal character access)

No extra memory structures required.

---

## ▶️ Compilation & Execution

### Compile:

javac UseCase11PalindromeCheckerApp.java


### Run:

java UseCase11PalindromeCheckerApp


---

## 🧪 Sample Output

Input:

madam


Output:

Is Palindrome? : true


Input:

hello


Output:

Is Palindrome? : false


---

## 📊 Complexity Analysis

Time Complexity: **O(n)**  
Space Complexity: **O(1)**

---

## 🎯 Advantages of This Approach

✔ Clean OOP structure  
✔ Easy to extend  
✔ Easy to test  
✔ Reusable service class  
✔ Follows software design principles

---

## 🏁 Conclusion

This use case demonstrates how object-oriented design improves code structure and maintainability while implementing a simple palindrome algorithm.

It is a scalable and professional approach compared to writing all logic inside