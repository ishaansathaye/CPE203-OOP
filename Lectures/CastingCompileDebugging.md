# Overriding toString and Equals, Casting (Upcasting and Downcasting), Compile-time vs Runtime, and Debugging

## Review
- Overriding
    - more specific version of parent method
    - How:
        Rewrite method and provide more specific functionality
- Overriding toString
    - Method signature (look up)
        - `public String toString()`
- Overriding equals
    - Goal: (Object equals compares what?) -> address
        - compare all data in specific object
    - Method signature (look up)
        - `public boolean equals(`**`Object other`**`)`

## Overriding Equals
- Do not use steps from Googling...sometimes ok but not always
1. **Null check -> make sure param is not null**
    - call method on null -> crash
    - `if (o == null) return false;`
2. **Check class type**
    - `if (other.getClass() != o.getClass()) return false;`
3. **Cast parameter to player**
    - `Player p = (Player) other;`
    - Tell compiler to use the methods of Player since accepting an Object
4. **Check all data is equal**
    - Use `.equals()` -> object
    - Use `==` -> primitive
    - Do not need getters
    - `return this.name.equals(p.name) && this.sticksTaken == p.sticksTaken;`
- **Do not use instanceof if**:
    - class not final
    - equals not final

## Downcasting vs Upcasting
- Downcasting
    - cast to more specific type
    - `Player p = (Player) other;`
    - Explicit cast
- Upcasting
    - force something to be labeled as a more general type
    - Implicit cast -> whenever you assign an object to a reference variable that is more general

## Reference Type vs Object Type
- Compile Time: when compiler runs
- Runtime: when the program actually runs (runs the objects in the heap)
    - Rules:
    1. Compiler only lets you -> use reference variable type
    2. At runtime -> use actual object in heap
    - At Runtime
        - run lowest version of method based on actual object

## P1 Tricks
- Passing 'this':
    - Refer to object with 'this'
- moveTo
    - pick which entity is the main entity

