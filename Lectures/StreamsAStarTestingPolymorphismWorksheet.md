# Streams, A* Testing, Polymorphism Worksheet

## Streams
- Temporary state for data from a list
- Can call lots of cool functions
- Process
    1. call .stream() -> does not edit original list
    2. use cool stream functions -> filter, forEach, map
    3. Turn stream back into data type you want

## Stream Patterns
- Map -> apply a rule to everything in list and get new list ouy
- Filter -> take in list and produce shorter list based on rule
- Fold -> take in list and produce single number

## Testing ComputePath (A*)
- `isValid(path, length)`
    - `assertEqual(path.length, length)`
- Looping to check if points are connected