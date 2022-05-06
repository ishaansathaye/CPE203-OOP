# Practice Quiz 3 Problems

## A.
- Review Lab 3 and be able to
    - identify common methods to put in an interface
    make and implement an interface
    - be able to loop through a list whose reference variable type is an interface and access specific types out of it using `instanceof`

## B.
Now in the column to the right of each code fragment below, write A if the fragment will always compile and run, CR if the class will compile but might crash at runtime, or WC if it will not compile
- `myCircle.intersectWith((Circle)myPoly);` -> WC
- `primitive = (Paintable)myCircle;` -> A
- `myRectangle.rotate(.707);` -> A
- `cartoon = (Outline)myRectangle;` -> CR
- ` myCircle = cartoon;` -> WC
- `myCircle.getOpacity()` -> A
- `cartoon = new Outline();` -> WC
- `((Polygon)cartoon).numberVerts()` -> CR
- `primitive = myPoly;` -> WC
- `cartoon new Circle(....);` -> A
