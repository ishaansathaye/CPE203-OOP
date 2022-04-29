# Inheritance Cont., Overriding Parent Methods (equals and toString)

## Super
- `super.var`
    - parent version of variable, not mine
    - **should not do this -> because parent variable should be private**
        - should not have two versions
- `super.method()`
    - specify "run parent version"
    - only need `super` if overriding
- `super`
    - setting parent data in the constructor

## Overriding: toString
- When overriding toString
    - `super.toString()` -> no getters
        - consistency
            - only one copy
            - only update n 1 place
        - do not want duplicate code

## Overriding: equals
- call `super.equals()`
- compile based on ref var type (LHS)
- **Contract:**
    - symmetry: x.equals(y) == y.equals(x)
- `.getClass()`
    - parent class is not final
    - equals not final

## Overriding other methods
- stull often want to call" super.method() in solution