# Comparable / Comparators

## Review
- Project 3
    - abstract in the parent
    - pull up some of the common code and override with a super call
    - pull up common code and nothing else
    - or abstract helper method
- Comparable + sort
    - interface to group objects that can be sorted
        - objects have compareTo method

## Comparable
- Not flexible
    - pick natural sort order
    - what if I do not have access to student class

## Comparator
- Another interface
- Also has a method to say which object is >, <, or = to 
- BUT not implemented by the Student (whatever I am trying to sort) class
    - external way
- Benefits
    - any sort order -> you can make as many as you need
    - External -> wrap up + pass around compare without editing Student
- Ex.
    - `Collection.sort(students, new StudentComparator());`
    - Ran call compare() on that object

## Comparison
|| Comparable | Comparator |
| --- | --- | --- |
| Implemented by | Class we want to sort: Ex. Student  | random floating class: Ex. StudentAgeComparator |
| Description | natural sort order compares this to other | external sort order (pass in both objects) |
| Con | not flexible | a hassle |

## Functional Interface
- interface with only 1 abstract method
- Ex. Comparator -> compare