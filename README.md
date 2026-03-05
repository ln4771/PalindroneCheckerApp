# Palindrome Checker App

The objective of the Palindrome Checker App is to design and implement a console-based Java application that validates whether a given string is a palindrome under different conditions, while strengthening core programming fundamentals and data structure concepts.

---

## UC1 : Application Entry & Welcome Message

Objective:
Create the entry point of the Palindrome Checker application and display a welcome message.

Flow:
- Start the application
- Display welcome message for the user
- Introduce the Palindrome Checker program

Concepts Used:
Main Method, Console Output, Basic Java Program Structure

---

## UC2 : Hardcoded Palindrome Result

Objective:
Check whether a predefined string is a palindrome.

Flow:
- Define a string variable
- Reverse the string using a loop
- Compare the original string with the reversed string
- Display whether it is a palindrome or not

Concepts Used:
String Handling, For Loop, Conditional Statements

---

## UC3 : Palindrome Check Using String Reverse

Objective:
Allow the user to enter a word and check if it is a palindrome by reversing the string.

Flow:
- Accept input from the user
- Reverse the string using a loop
- Compare the original string with the reversed string
- Display whether it is a palindrome or not

Concepts Used:
Scanner Class, String Manipulation, For Loop, Conditional Statements

---

## UC4 : Character Array Based Palindrome Check

Objective:
Check whether a given string is a palindrome using a character array.

Flow:
- Accept input from the user
- Convert the string into a character array
- Compare characters from the start and end
- Continue comparison until the middle of the array
- Display whether it is a palindrome or not

Concepts Used:
Character Array, Two Pointer Technique, Loop, Conditional Statements

---

## UC5 : Stack-Based Palindrome Checker

Objective:
Check whether a given string is a palindrome using a Stack data structure.

Flow:
- Accept input from the user
- Push each character of the string into the stack
- Pop characters from the stack to form the reversed string
- Compare the original string with the reversed string
- Display whether it is a palindrome or not

Concepts Used:
Stack (LIFO), Push Operation, Pop Operation, Loop, Conditional Statements

---

## UC6 : Queue + Stack Based Palindrome Check

Goal:
Demonstrate FIFO vs LIFO using Queue and Stack.

Flow:
1. Enqueue characters
2. Push characters to stack
3. Compare dequeue vs pop

Key Concepts used in UC6:
- Queue – A linear data structure that follows the First In First Out (FIFO) principle.
- Enqueue & Dequeue Operations – Used to insert and remove elements from the queue.
- Stack vs Queue – Demonstrates the behavioral difference between LIFO and FIFO structures.
- Logical Comparison – Matching dequeue (queue) output with pop (stack) output to validate palindrome logic.

Data Structures Used:
Queue, Stack

---

## UC7 : Deque-Based Optimized Palindrome Checker

Goal:
Use Deque to compare front and rear elements.

Flow:
1. Insert characters into deque
2. Remove first & last
3. Compare until empty

Key Concepts used in UC7:
- Deque (Double Ended Queue) – A data structure that allows insertion and deletion from both front and rear ends.
- Front and Rear Access – Enables direct comparison of first and last characters.
- Optimized Data Handling – Eliminates the need for separate reversal data structures.

Data Structure Used:
Deque

---

## UC8 : Linked List Based Palindrome Checker

Goal:
Check palindrome using singly linked list.

Flow:
1. Convert string to linked list
2. Reverse second half
3. Compare halves

Key Concepts used in UC8:
- Singly Linked List – A dynamic data structure where elements are connected using node references.
- Node Traversal – Sequential access to elements using next references.
- Fast and Slow Pointer Technique – Used to find the middle of the linked list efficiently.
- In-Place Reversal – Reverses the second half of the list without extra memory.

Data Structure Used:
Singly Linked List

---

## UC9 : Recursive Palindrome Checker

Goal:
Check palindrome using recursion.

Flow:
1. Recursive call compares start & end
2. Base condition exits recursion

Key Concepts used in UC9:
- Recursion – A technique where a method calls itself to solve smaller subproblems.
- Base Condition – Prevents infinite recursion and terminates the recursive calls.
- Call Stack – Memory structure used to manage method calls during recursion.

Data Structure Used:
Call Stack

---

## UC10 : Case-Insensitive & Space-Ignored Palindrome

Goal:
Ignore spaces and case while checking a palindrome.

Flow:
1. Normalize string
2. Apply previous logic

Key Concepts used in UC10:
- String preprocessing
- Regular expressions

Data Structure Used:
String / Array

---

## UC11 : Object-Oriented Palindrome Service

Goal:
Encapsulate palindrome logic in a class.

Flow:
1. Create PalindromeChecker class
2. Expose checkPalindrome() method

Key Concepts used in UC11 (OOPS):
- Encapsulation
- Single Responsibility Principle

Data Structure Used:
Internal (Stack / Array)

---

## UC12 : Strategy Pattern for Palindrome Algorithms

Goal:
Choose a palindrome algorithm dynamically.

Flow:
1. Define PalindromeStrategy interface
2. Implement StackStrategy, DequeStrategy
3. Inject strategy at runtime

Key Concepts used in UC12:
- Interface
- Polymorphism
- Strategy Pattern

Data Structure Used:
Varies per strategy

---

## UC13 : Performance Comparison

Goal:
Compare the performance of different palindrome approaches.

Flow:
1. Run multiple algorithms
2. Capture execution time
3. Display results

Key Concepts used in UC13:
- System.nanoTime()
- Algorithm comparison
