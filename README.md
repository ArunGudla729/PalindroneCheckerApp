# UC7 – Deque-Based Optimized Palindrome Checker

## 📌 Goal
Use a Deque data structure to compare front and rear elements to determine whether a string is a palindrome.

---

## 🔁 Flow of Execution

1. Insert characters into Deque
2. Remove first and last elements
3. Compare both characters
4. Continue until deque becomes empty or mismatch occurs

---

## 🧠 Key Concepts Used in UC7

### 1️⃣ Deque (Double Ended Queue)
A data structure that allows insertion and deletion from both front and rear ends.

Java Implementation Used:

---

### 2️⃣ Front and Rear Access
- `removeFirst()` → Removes element from front
- `removeLast()` → Removes element from rear

This enables direct comparison of first and last characters.

---

### 3️⃣ Optimized Data Handling
- No string reversal required
- No extra stack or array needed
- Efficient bidirectional traversal

---

## ⚙️ Data Structure Used

**Deque (ArrayDeque implementation)**

Operations Used:
- `addLast()`
- `removeFirst()`
- `removeLast()`

Time Complexity: **O(n)**  
Space Complexity: **O(n)**

---

## ▶️ Sample Input / Output

Input:hello
Output:
The given string is NOT a palindrome.

---

## 🎯 Conclusion

This use case demonstrates optimal bidirectional traversal using Deque.  
It eliminates the need for reversing the string and provides an efficient front-to-back comparison approach.