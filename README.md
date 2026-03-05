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

Objective:
Demonstrate FIFO vs LIFO behavior using Queue and Stack.

Flow:
- Enqueue characters
- Push characters to stack
- Compare dequeue vs pop
- If all characters match, the string is a palindrome

Concepts Used:
Queue (FIFO), Stack (LIFO), Enqueue Operation, Dequeue Operation

Data Structures Used:
Queue, Stack

---

## UC7 : Deque-Based Optimized Palindrome Checker

Objective:
Check whether a given string is a palindrome using a Deque data structure.

Flow:
- Insert characters into deque
- Remove first and last characters
- Compare them
- Continue until deque becomes empty or mismatch occurs
- Display the palindrome result

Concepts Used:
Deque (Double Ended Queue), Front and Rear Access, Logical Comparison

Data Structure Used:
Deque

---

## UC8 : Linked List Based Palindrome Checker

Objective:
Check whether a given string is a palindrome using a singly linked list.

Flow:
- Convert the string into a linked list
- Traverse the linked list
- Compare characters from both ends
- Continue comparison until the list becomes empty
- Display the palindrome result

Concepts Used:
Singly Linked List, Node Traversal, Fast and Slow Pointer Technique

Data Structure Used:
Linked List

---

## UC9 : Recursive Palindrome Checker

Objective:
Check whether a given string is a palindrome using recursion.

Flow:
- Compare the first and last characters
- Recursively check the remaining substring
- Stop recursion when base condition is met
- Display whether the string is a palindrome or not

Concepts Used:
Recursion, Base Condition, Call Stack

Data Structure Used:
Call Stack
