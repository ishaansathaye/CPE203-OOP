# Cohesion, Coupling, P2 Intro (Action Demo), Compiler Rules (C / WC / A)

## Review
- Interface
    - holds -> abstract methods -> no implementation
    - promise: class implementing it will have the abstract methods implemented
    - **class can implement many interfaces**

## Cohesion
- **Cohesion** -> what a class or module can do and how closely related everything is in said module
    - *High Cohesion* -> classes or modules that are tightly related to each other
    - *Low Cohesion* -> a class is broad / unfocused, doing a large variety of actions
- **Goal** -> achieve high cohesion
- **What method/class seems to have lower cohesion after completing (or working on for a bit) P1?**
    - Entity - EntityKind (8 Classes?)
    - WorldModel
    - VirtualWorld
    - Action - ActionKind (2 Classes?)
    - Functions

## Coupling
- **Coupling** -> how interdependent your classes are
- **Tight Coupling** -> lots of interdependencies
    - if you change something in once class, you will have to change another
- **Loose Coupling** -> though classes are connected, can modify one without modifying the other
    - *Goal*
- To achieve loose coupling
    - *Data Hiding and Getters/Setters*
    - *Interfaces*

## P1 -> P2
- Cohesion:
    - Take classes with:
        - Low cohesions and make high cohesion
    - Which classes:
        - Entity/Action: kind enums
        - Functions
    - How:
        - More classes!
- Create looser couping
    - How:
        - Interfaces to group new classes
        - Give methods common names
- Problems
    - Will create duplicate code -> so do not add inheritance

**Action Class Refactoring in Module 10 Zoom meeting**