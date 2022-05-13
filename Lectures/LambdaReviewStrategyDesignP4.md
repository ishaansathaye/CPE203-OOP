# Lambda Review, Strategy Design Pattern, P4 Checkpoints, DFS Search

## Review
- Functional Interface
    - any interface with only one abstract method
- Comparator -> compare
- Predicate -> test
- Function -> apply
- Method Reference Operator -> ```Student::getFirstName```
- Key Extractor -> `Comparator<T>` that extracts a key from a value

## Strategy Design Pattern - Project 4
- Design Pattern -> general reusable solution to commonly occurring problem
- Strategy Design Pattern
    - "behavioral design pattern"
    - pass an algorithm as parameter to bugger algorithm/context
- Ex.
    - Context algo: sort
    - Param: Comparator
- Demo
    - Context (filtering method / printing method)
- Project 4
    - Context where you can switch out pathing algo to take next step