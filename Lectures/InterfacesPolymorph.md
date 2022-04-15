# Interfaces, Polymorphism, Cohesion, Coupling, and P2

## Review
- Overriding:
    - equals() - null, class, cast, data
- Upcasting/Downcasting
    - Up: implicit
    - Down: explicit
- Runtime
    - actual method (not what it was labeled as)
- Is a Relationship
    - Inheritance
        - Can: instantiate
        - Inherits: method implementation, data

## Interfaces
- An abstract type (like a class) that holds abstract methods
    - Undefined methods
         - no implementation
         - no body
- **Promises**
    - all classes that implement will have have the interface's abstract methods implemented
- **A class can**
    - implement many interfaces
- **Cannot have**
    - instance variables
    - method implementation that uses instance variables directly
- **Cannot be**
    - instantiated
- Why interface over class:
    - *too vague to want to instantiate*
    - *grouping by what something can do*
    - *allows for multiple is-a relationships*
- `public class A implements B, C { ... }`
    - `A` is a class
    - `B` and `C` are interfaces
    - `A` implements `B` and `C`
- **A class can have additional methods besides what is in the interface**
    - BUT: you should type check and have to cast to call those additional methods if it is labeled by the interface
    - Ex. `Player p = new GreedyPlayer(); ((GreedyPlayer).p).taunt();`
    - Casting - for the compiler
    - If statement check - so we know code will not crash

## Interface Syntax
```java
public class Name implements Interface {
    public void interfaceMethod() { //need to say public
        System.out.println("Hello");
    }
}

public interface Interface {
    void interfaceMethod(); //no need to say public
}
```

## Polymorphism: Same name, Many forms
- Example 1
    - interfaces: can group classes under a common name and call methods that act differently based on the object
- Example 2
    - inheritance: overriding methods 
- Example 3
    - overloading: (ad hoc polymorphism, compile-time polymorphism)

## Flat vs Hierarchy
- **Class implement interfaces**
- **Classes extend classes**
- **Interface extend interfaces**