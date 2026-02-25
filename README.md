
# 📘 UC4 – Character Array Based Palindrome Checker

## 📌 Overview

This project demonstrates a **Palindrome Checker** implemented in Java using a **Character Array (`char[]`)** and the **Two-Pointer Technique**.

The program converts a string into a character array and compares characters from both ends to determine whether the string is a palindrome.

---

## 🎯 Goal

Convert a string into a `char[]` and efficiently compare characters using index-based access without creating extra objects.

---

## 🔁 Program Flow

1. Convert input string to `char[]`
2. Initialize two pointers:

    * `start` → beginning of array
    * `end` → last index of array
3. Compare characters at both pointers
4. Move pointers toward center
5. Return result

---

## 🧠 Key Concepts Used

### 🔹 Character Array (`char[]`)

A primitive array used to store individual characters for efficient index-based access.

### 🔹 Array Indexing

Access elements using index positions starting from `0`.

### 🔹 Two-Pointer Technique

One pointer starts from the beginning and the other from the end, reducing unnecessary comparisons.

### 🔹 Time Complexity Awareness

Efficient comparison without creating extra objects.

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`

