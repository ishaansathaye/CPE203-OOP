# Polymorphism Practice and P5 Intro

## Polymorphism
- Same name, many forms 
- Examples
    - Interfaces
    - Parent classes (inheritance)
    - Overloading (ad hoc polymorphism)

## Polymorphism Rules
- Compiler uses reference var type / declared type
    - type (meaning declared type + declared parents)
- Reference var type must be >= actual object
    - "is-a" relationship
- At runtime -> use most specific version of function

## Practicing Polymorphism
- If overloading AND overriding, still
    1. Pick method signature at compile time
    2. See if method from #1 was overriden