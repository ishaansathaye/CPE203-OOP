# Abstract Classes and Inheritance Practice

## Inheritance UML
- In UML protected variables use `#`

## Review
- Overriding: super.method()
    - have parent do its job with its data
- super() -> set parent data
- Equals Contract:
    - symmetry: x.equals(y) == y.equals(x)

## Abstract Classes
- "is-a" relationship and will use on P3
- Mix between interface and class
- Can have: one parent, hold instance fields, hold instance methods, hold abstract methods
- Cannot: instantiate

## Abstract Class Syntax
- `public abstract class MyClass {}`
    - can still have instance variables
    - need constructor
    - can have instance methods using those instance variables
    - can have abstract methods -> `protected abstract void abstractMethod();`
- `public abstract class Child extends MyClass {}`

## Inheritance Practice
- [Inheritance Practice Work](/Lectures/InheritancePractice/Animal.java)
