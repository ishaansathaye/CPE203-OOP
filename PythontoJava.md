# Lecture 1: Python to Java

**Notability Notes: Python to Java**

## Python Language
- Interpreted language (read line by line)

## Java language
- Compiled language (whole file processed at once)

## Steps to Compile/Run: Command Line
- Need to compile first: ```javac <filename>.java```
    - Turns the Java code into Java byte code
    - **Always save and recompile after making changes**
- Then run: ```java <filename>```
    - Runs the Java byte code

## Syntax of Java
- Syntax, Whitespace, and Code Blocks
    - {} - code block
    - ; - how to end a statement
- Classes
    - **Everything is in a class**
    - OOP:
        - Everything
        - data
        - methods
            - functions in a class
- **Filename must match class name**
    - Case Sensitive
- **Everything has a type**
- Main Method
    - Every program needs a main method
        - Entry point of the program
    - ```Must be public static void main(String[] args)```
- ```public```
    - *access modifier*
    - anybody can use this method or variable
- ```static```
- ```void```
    - return type
    - **returns nothing**
- Printing
    - Write to the console
        - ```System.out.println()``` - adds \n to the end
        - ```print``` - no new line
    **- Can concatenate number and strings**