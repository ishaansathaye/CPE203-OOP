# Interacting Classes (Nim), Scanner, Method Placement, Overriding toString, P1 Hints

## Review
- Object class
    - object - instance of a class
    - Object - parent class (super class)
        - toString()
        - getClass()
        - equals()
- Overloading
    - compiler resolution
        - Reference variable type (what compiler looks at)

## Interacting Classes (Nim)
- Nim
    - Classes (nouns)
        - Data (attributes/adjectives)
        - Methods (verbs/actions)
    - Stick
    - Pile
        - number
    - Player
        - turn name
    - Screen
    - Game State
        - winning

### Possible Solution: Design/UML
- UML
    - Game
        - +main: void
    - Player
        - -sticksTaken: int
        - -name:String
        - -
        - +sticksTake(): int
        - +takeTurn(Pile): void
    - Pile
        - -sticks:int
        - -
        - +sticks(): int
        - +remove(int): void
- Things to/not include in UML
    - Access Modifiers 
        - +: public
        - -: private
    - Class Name (top)
    - Instance/Class Variables (second)
    - methods (third)
    - *do not need constructor in UML*

## Scanner
- Used for simple text-based UI in Game of Nim
- **Like `input()` -> read in from command line OR files**
- *In P1, if method uses `Scanner` then leave in Functions.java`
- **Scanner**
    - class that has methods to read input
    - `Sanner s = new Scanner(System.in);` (reading from command line)
        - for file give the file name
    - `s.next*();` (scan any next Int, Double, String, etc.)
        - reads in input and cast
        - `s.hasNext*()` -> return boolean

## Object: toString()
- Every object has a toString() method
- Object parent class methods:
    - toString()
    - getClass()
    - equals()
    - All of these three are default implementation
        - It will inherit the parent class's implementation
    - **If you call a parent method on a child class, it will use/inherit parent's default implementation**
    - **If you want more specific version:**
        - **Overriding**
            1. Exact same method signature as parent (and same parameters too)
                - *Method signature:*
                    - return type
                    - method name
                    - parameters
            2. Providing more specific implementation based on child's data
                - *Implementation: body of a method*
            3. Vertical hierarchy, data.
        - Overloading
            - same method signature but different parameters
            - providing different implementation based on different input
            - can be different versions on same level
- Overriding toString():
```java
@Override
public String toString() {
    return this.name;
}
```

## Project 1 Hints
- Move rest of methods
- Make instance cars private
- Make getters/setters if needed
- Make sure UML is uploaded and matches (complete as you go)
- Move static variables or make methods private as you see fit
- *Code -> Generate -> getters and setters*
- Common Bugs
    - Dude transforms and freezes, sapling does not animate, trees do not get chopped down
        - Make sure you are calling scheduleActions(0 on approtiate entity
        - Ask on piazza
        - Will go over more on Wed