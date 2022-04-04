# Classes, Simple Classes, and UML

## ArrayLists
- Operations: append, shrink...
- Can only hold objects *not primitive types*
- `ArrayList<String> myStrings = new ArrayList<>();`
- *Initializing ArrayList*
    - **Constructor**: method that creates instances of a class
    - **Overloading**: method or constructor that has the same name, but different #/type of params
        - `ArrayList<String> myStrings = new ArrayList<String>(Arrays.asList("hi"));`
        - `ArrayList<String> myStrings = new ArrayList<String>(100);`
            - `100` is the initial capacity of the ArrayList
        - *Multiple constructors*
    - **Wrapper Classes - to put in an ArrayList**
        - int -> Integer
        - double -> Double
- Autoboxing - converting primitive types to their wrapper classes
- Unboxing - converting wrapper classes to their primitive types

## Relationships: List, ArrayList, LinkedList
- List: is an interface
    - ArrayList
    - LinkedList
- Above relationship is called a "is-a" relationship

## Reference Variable Type vs Object Type
- `List<Integer> "reference_variable" = "actual_object"`
- In one section of List memory: the linked list is stored
- **Cannot**:
    - instantiate an interface
    - Lists on the right side of the assignment

## HashMaps
- Create Map: `HashMap<key_type, value_type> myMap = new HashMap<>();`

## Simple Classes
- Making own class
    - Declare instance variables (data in class)
    - `this` keyword: refers to the current instance of the class
        - like `self` in python
    - Access modifier
        - **private**: only access this data/method from within the class
        - Data Hiding - OOP tenet
            - instance vars are private - hold data for the object
            - protects data
            - easier to collaborate on big projects
    - Getters/Accessors
        - public methods which return private data
    - Setters/Mutators
        - public methods which set private data
        - ```public void setName(String name) { this.name = name; }```
    - **`final` keyword**
        - cannot be changed
        - cannot be overridden