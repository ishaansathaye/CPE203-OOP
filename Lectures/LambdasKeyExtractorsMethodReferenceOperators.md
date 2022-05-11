# Other Functional Interfaces, Lambdas, Key Extractors, Method Reference Operators

## REview
- Comparable / Comparators
    - both interfaces
    - both help compare 2 objects 

## Lambdas
- Unnamed chunk of code that I can pass around and use later
- "anonymous functions" -> in java "anonymous class"
- Syntax:
```java
(Student s1, Student s2) -> {
    return s1.getFirstName().compareTo(s2.getFirstName());
}
```
- Shortcuts
    - Why don't I have to include name (compare) and return type?
        1. `Comparator<Student> comp = () -> {};`
        2. `Collections.sort(Students, () -> {});`  
- Do not need to include return or signature:
```java
(s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName());
```
```java
@Test
public void testNameComp() {
    // lambda (longer syntax)
    Comparator<Student> comp1 = (Student s1, Student s2) -> {return s1.getFirstName().compareTo(s2.getFirstName());};
    // lambda (shorter syntax)
    Comparator<Student> comp2 = (s1, s2) -> s1.getFirstName().compareTo(s2.getFirstName());

    assertTrue(comp1.compare(studentArray[0], studentArray[3]) < 0); // B < P>
}
```
- **Call .reversed() on comparator not on lambda expression**

## Functional Interfaces
- Predicate
    - takes in -> anything
    - returns ->  boolean
    - method - > test (like compare)
- Function
    - takes in -> T (anything)
    - returns -> R (anything)
    - method - > apply
- Any function I could Ever want to Pass
    1. Find functional interface that matches input + output
    2. Declare variable of that type
    3. Lambda to actually make it
    4. Find method name (test, compare...)

## Lambda Practice
```java
Predicate<Student> pred = (s) -> s.getAge() > 21;
assertTrue(pred.test(studentArray[0]));

Function<Student, String> func = (s) -> s.getFirstName();
assertEquals("Bob", func.apply(studentArray[0]));
```

## Key Extractor and Method Reference Operators
```java
// method reference operator
Function<Student, String> func = Student::getFirstName;


Comparator<Student> comp3 = Comparator.comparing(s -> s.getFirstName());
Comparator<Student> comp3 = Comparator.comparing(Student::getFirstName);
```