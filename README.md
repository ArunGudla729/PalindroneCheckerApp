# UC9 – Recursive Palindrome Checker

## 📌 Goal
Check whether a string is a palindrome using recursion.

---

## 🔁 Flow of Execution

1. Compare first and last characters
2. If matched → recursive call for inner substring
3. If mismatch → return false
4. Base condition stops recursion

---

## 🧠 Key Concepts Used in UC9

### 1️⃣ Recursion
A technique where a method calls itself to solve smaller subproblems.

In this case:
check(s, start + 1, end - 1)


---

### 2️⃣ Base Condition
Prevents infinite recursion and terminates the recursive calls.
if (start >= end)
return true;


---

### 3️⃣ Call Stack
Memory structure used to manage method calls during recursion.

Each recursive call:
- Stores parameters (start, end)
- Waits for inner call result
- Returns true/false back up the stack

---

## ⚙️ Data Structure Used

**Call Stack**

No explicit data structure like array or list is used.
The system stack handles recursive method calls.

---

## ▶️ Sample Output

Input:madam

Output:The given string IS a palindrome


---

## 📊 Complexity Analysis

Time Complexity: **O(n)**  
Space Complexity: **O(n)** (due to recursive call stack)

---

## 🎯 Conclusion

This recursive approach demonstrates:

- Divide-and-conquer strategy
- Proper base condition handling
- Efficient inward character comparison