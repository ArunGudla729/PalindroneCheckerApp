# UC8 – Linked List Based Palindrome Checker

## 📌 Goal
Check whether a string is a palindrome using a Singly Linked List.

---

## 🔁 Flow of Execution

1. Convert string to singly linked list
2. Find middle using fast and slow pointer
3. Reverse second half of the list
4. Compare first half and reversed second half

---

## 🧠 Key Concepts Used in UC8

### 1️⃣ Singly Linked List
A dynamic data structure where elements are connected using node references.

Structure:
Node {
char data;
Node next;
}

---

### 2️⃣ Node Traversal
Sequential access to elements using `next` references.

---

### 3️⃣ Fast and Slow Pointer Technique
- Slow pointer moves 1 step
- Fast pointer moves 2 steps
- When fast reaches end, slow is at middle

Time Complexity: O(n)

---

### 4️⃣ In-Place Reversal
Second half of the linked list is reversed without using extra memory.

Reversal Logic:
- Maintain `prev`, `current`, `next`
- Change `current.next` to `prev`

Space Complexity: O(1)

---

## ⚙️ Data Structure Used

**Singly Linked List (Custom Node Implementation)**

Operations Used:
- Node creation
- Pointer traversal
- In-place reversal

---

## ▶️ Sample Output

Input:
hello


Output:

The given string is NOT a palindrome.


---

## 📊 Complexity Analysis

Time Complexity: **O(n)**  
Space Complexity: **O(1)** (In-place reversal)

---

## 🎯 Conclusion

This approach efficiently checks palindrome using:
- Fast/slow pointer technique
- In-place linked list reversal
- Half comparison

It avoids extra arrays or stacks and demonstrates optimized linked list manipulation.