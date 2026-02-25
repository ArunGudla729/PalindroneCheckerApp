📄 README: Strategy Pattern for Palindrome Algorithms
📝 Overview
This project demonstrates Use Case 12, focusing on the Strategy Design Pattern. Instead of hardcoding a single way to check for palindromes, this architecture allows the application to switch between different data structures (Stack vs. Deque) at runtime without changing the core application logic.

🚀 Key Features
Dynamic Interchangeability: Switch algorithms on the fly using setStrategy().

Extensible Design: Easily add a TwoPointerStrategy or RecursionStrategy by simply implementing the PalindromeStrategy interface.

Clean Separation: The main app doesn't need to know how the palindrome is checked, only that the result is a boolean.

🛠 Concepts Used
Interface: Defines the isValid contract.

Polymorphism: The app treats different objects (Stack/Deque) as the generic PalindromeStrategy type.

Dependency Injection: The specific algorithm is "injected" into the main class at runtime.

📋 How to Run
Ensure you have JDK 8 or higher installed.

Save the code as UseCase12PalindromeCheckerApp.java.

Compile: javac UseCase12PalindromeCheckerApp.java

Run: java UseCase12PalindromeCheckerApp