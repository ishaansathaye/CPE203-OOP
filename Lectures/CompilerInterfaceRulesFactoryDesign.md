# Compiler and Interface Rules (CR, WA, A), Factory Design Pattern, Debugging Hints

## Interfaces and the Compiler
- Can only methods based on *reference types*
- To treat objects more specific, must *cast*
- The compiler allows down-casting, but it might crash at runtime

## Interfaces Worksheet
![image info](./images/interfacesWksht.png)
- Casting: CR -> unless casting from concrete class to concrete class, also casting type
- Problems
    1. potion.mix((Potion)movable);
        - CR -> since do not know if movable is Potion or Weapon
    2. sword = weapon;
        - WC -> sword is more specific that a weapon, left hand must be greater than or equal to right hand
    3. weapon = new Sword();
        - A
    4. weapon = (Sword) potion;
        - WC
    5. weapon.sharpen();
        - WC -> interface/parent does not have the method 
    6. ((Sword)movable).sharpen();
        - CR -> if it was not a sword
    7. movable = sword;
        - A -> up-casting, trying to label sword as movable in the stack (as a more general thing)
    8. potion.mix(movable);
        - WC -> movable is not a potion
    9. movable = new Weapon();
        - WC -> cannot instantiate interface
    10. sword.strike();
        - A -> strike is a method in the sword class

## P2
- Be careful with casting
    - Best to pick ref var type that is general enough to group classes, but specific enough to call methods needed

## Factory Design Pattern
- Entity, Function, Action get higher cohesion
- Design Pattern
    - General, reusable solutions to commonly occurring problems
- **Factory Design Pattern**
    - Put all create methods in their own class
        - name ```Factory.java ```

    