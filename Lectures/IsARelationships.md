# Is-A Relationships (More Types), Overloading Resolution (Lab 2), Designing Interacting Classes Intro (Game of Nim)

## Review
- Tips on deciding where to place function:
    - Look at type of objects being passed in
    - Look at which object's data is grabbed most frequently
    - Look at which object's data drives the function
    - Which object is doing the action?
- Data first

## Is-A Relationships (Object Superclass)
- `List<String> myStr = new ArrayList<>();`
- List:
    - **interface**
    - cannot instantiate (cannot put `List` on the right side)
    - anything under it (anything that implements it will have its methods)

## Parent Classes (Superclasses)
- Another type if is-a relationship
- "Ultimate Superclass"
    - Object: parent category to everything
    - Object not going to be draw on the UML because implied
        - 
## Reference Type
- Reference Type
    - Type on stack
    - Type you declare variables
    - What the compiler looks at
- Applies To:
    - when you declare a variable
    - when you declare a parameter
- Ex: `public static List<Boolean> applicantAcceptable(List<Integer> scores, int threshold) {}`

## Overloading (Lab 2)
- Lab 2 - do overloading with the perimeter method
- How the compiler picks which method to call
- Overloading resolution
    1. Exact match -> based on referenced variable type of parameter and argument
    2. Closes is-a relationship -> param:Object, arg:Circle (so can pass a circle as an argument)
    3. Autoboxing/Unboxing -> param:Object, arg:int
    4. If still no match -> Won't compile
- Resolution done at compile time (based on reference var)

## Takeaways
- Compiler picks appropriate method based on reference type