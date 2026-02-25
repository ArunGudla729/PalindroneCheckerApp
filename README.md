# UC10 – Case-Insensitive & Space-Ignored Palindrome Checker

## 📌 Goal
Check whether a string is a palindrome while:

- Ignoring spaces
- Ignoring uppercase/lowercase differences
- Ignoring special symbols

---

## 📝 Description

This program validates a palindrome after preprocessing the input string.

Normalization ensures that formatting differences do not affect logical palindrome validation.

Example:"A man a plan a canal Panama"

Should return:
true


---

## 🔁 Flow of Execution

1. Take input string
2. Normalize string:
    - Remove spaces and special characters
    - Convert to lowercase
3. Compare characters from both ends
4. If all symmetric characters match → Palindrome
5. If mismatch found → Not Palindrome

---

## 🧠 Key Concepts Used in UC10

### 1️⃣ String Preprocessing
Before checking palindrome, the string is cleaned using:

```java
input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

Removes special symbols

Removes spaces

Converts to lowercase

Pattern used:[^a-zA-Z0-9]

^ → NOT

a-z → lowercase letters

A-Z → uppercase letters


for (int i = 0; i < normalized.length() / 2; i++) {
    if (normalized.charAt(i) != 
        normalized.charAt(normalized.length() - 1 - i)) {
        isPalindrome = false;
        break;
    }
}

📊 Complexity Analysis

Time Complexity: O(n)
Space Complexity: O(n)