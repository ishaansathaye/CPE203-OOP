# P2 Hints, HashCode / Equals

## Review
- [Compiler Rules vs Runtime Cheat Sheet](https://docs.google.com/document/d/1t1jSxgapMT3Se8FhwihxKTnBasyh55Risl8m6J1BqAk/edit)

## P2 Help
- Checkpoints 1 / 2
    - Stump *look at create functions*
        - Instance variables
            - id
            - position
            - images
        - Methods
            - getCurrentImage
            - nextImage ???
            - getPosition
            - setPosition
    - Look at:
        - creates
        - resources - dude
- Checkpoints: Methods
    - Use Method Names -> look at type of entity name
    - Use method purpose / used locations: -> do not have methods that do nothing
        - should not call schedule actions on a stump
        - do not call getHealth on things that do not have that attribute
- Replacing EntityKind
    - use class Kind not EntityKind 
    - Passing argument -> getClass()
- Making Interfaces
    - all the other interfaces that are made point to the Entity interface
    - Group interfaces based on what a class can do
    - Do not want class to have empty method or method not being used
    - Casting and `Instanceof`
        - **Should only need to call `instanceof` 1 time in virtual world**
        - if casting, see if you can change the reference variable type

## HashCode
- Hash
    - Hash:
        - numeric representation of a object
- Like toString (but with ints)
- In Object's HashCode:
    - `public int hashCode() {}`
- Overriding
    - Just like we often want to override equals method in custom classes, also will sometimes want to override hashCode
    - When do we want to override hashCode()?
        - **Anytime we override equals()**
- Contract
    - When invoked on the same object > if object jas not changed should induce some numbers
    - WHen invoked on two equals objects (according to equals method) -> objects have same hash code
    - It is NOT required that two unequal objects hash to two different values -> but better performance if avoid collisions