# Abstract Helper Methods (P3/Lab 5), Comparable / Sorting

## Review
- Abstract Class
    - data, constructor, instance methods, making some abstract methods, adding more abstract classes
- Checkpoint 4
    - completely unique -> abstract
    - completely common -> put in parent/delete in child
    - if method is partially unique
        - override
            - using a abstract helper method in the parent
- Animal, Dog, and Cat exercise practice for Lab 5 and Project 3

## Comparable and Sorting
- how we can use interfaces to make general algorithms/methods
- use interfaces to pass in a function to a function
- look at shortcuts

## Sorting
- Ways to sort lists / arrays
    - quick sort, merge, insertion...
- Built in Way
    - sort method and uses the TimSort
- Challenge: What would be tricky about generic sort method?
- `Collections.sort()` -> sorts in place

## Natural Sort Order
- Interface: `Comparable<T>`
    - has 1 abstract method
        - `public int compareTo(Type t)` -> type of class
            - returns a negative number if this object is less than the specified object (this is first)
            - returns a positive number if this object is greater than the specified object (this is greater than other student)
            - returns 0 if this object is equal to the specified object