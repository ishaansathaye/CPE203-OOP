# Maps, Simple Classes, and OOP vs Procedural

## OOP Tenants - 3 things: (data hiding, encapsulation, turning instance to static)
- **Data Hiding**
    - *private variables*
        - forces you to go through public getters/setters to change variables
    - *encapsulation* - **different from data hiding**
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