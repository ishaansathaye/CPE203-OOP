# Maps, Simple Classes, and OOP vs Procedural

## OOP Tenants - 3 things: (data hiding, encapsulation, turning instance to static)
- **Data Hiding**
    - *Private Variables*
        - forces you to go through public getters/setters to change variables
    - *Encapsulation* - **different from data hiding**
        - bundling data and methods together in a single unit (in Java, unit=class)
        - Benefits
            - easier to debug
            - easier to collaborate
            - control over data
                - changing code requires less refactoring
                - validate data
- **Instance Methods vs Static Methods**
    - *Static Variable*
        - `public static int INNINGS_PER_GAME = 9;`
        - **piece of data belongs to the class not the object**
        - class variable, not an instance variable
        - **a single copy of a variable shared by all objects and classes**
        - Do not need object to use: `Pitcher.INNINGS_PER_GAME`
    - *Static final*
        - **constant**: `public` (anybody can access) `static` (shared) `final` (cannot reassign)
    - *Static method*
        - method that belongs to the class and not the object
        - can call the method without having an object
        - Ex. `Math.pow()`
        - **cannot use instance variables**
    - *Instance method*
        - method you can only call on an object
        - Ex. `Course c = new Course(); c.getName()`
        - **can access/modify instance variables**
        - Ex. uses a pitcher's data to calculate their earned runs average
        - **Syntax: put in class and omit static**

## Review
- Encapsulation - bundling data + methods
- Data hiding - instance variables private
- Instance method (era)
    - method that is not static
    called on an object + uses instance variables
- Constants 
    - `public static final int INNINGS_PER_GAME = 9;`
    - static means shared
    - final means cannot be reassigned
- Static vs Instance
    - Static: shared and not tied to a specific object
        - "class not object"
        - can't use instance variables for methods
    - Instance
        - can use instance variables (method)

## Project 1 Hints
- Refactor (design and then code)
    - Design 1st in UML (UML + code should match)
    - Design 2nd in UML (UML + code should match)
        - make sure UML saves