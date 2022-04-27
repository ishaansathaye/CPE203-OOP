# Inheritance

## Review: HashCode
- Contract
    - if equal according to the equals() method -> hashcode should give the same hash
    - **unequal objects CAN have the same hash**

## Equals and HashCOde (null and shortcuts)
- Use ternary operators: ? 0: temp

## Inheritance
- Parent classes -> Can instantiate parent, 1 parent, and parents can hold data and implementation
- Interfaces -> cannot instantiate, implement data, cannot hold data and implementation
- Syntax: `public MyClass extends ParentClass {}`

|  | Interfaces | Parent CLasses|
| ---- | ------ | ------------- |
| class can | implement many  | extend 1 |
| can have instance vars | no | yes |
| can have instance methods (implementation) | no   | yes |
| has abstract methods | yes | no |
| instantiate | no | yes |

## Parent Data
- protected -> child classes can access EVEN if in other packages
    - feel like public 
    - do not want instance variables protected