# Strategy Pattern and P4 Intro, DFS

## Review
- Lambda / method reference operators
- Strategy Design Pattern
    - pass algorithm to context algo
    - Ex. sort (context)

## P4 Pathing Strategy
- Context -> Sort
- Method -> Compare
- Project
    - Context -> pathing -> nextPosition
    - Method -> computePath -> how to get path to target

## Transition from Comparator Strategy to P4 Strategy
| Interface | Comparator | Pathing Strategy |
| -------- | ---- | ----------- |
| Classes (will use lambdas but INSIDE our classes) | StudentAge Comparator | Single Step Pathing Strategy, A Start Pathing Strategy |
| Method | compare |computePath |
| Context | sort | nextPosition |

## P4 Checkpoints
1. Download sandbox and set up
    - Safe place to write and test code
2. Copy interfaces into project and how to make nextPosition use those interfaces

## DFS and Recursion Review
- DFS: Binary Tree
    - Tree
        - No cycles
        - Connected graph
    - Binary Tree
        - Each node has at most 2 children
        - Not binary search tree (already sorted)
- DFS: Pre-order
    - Hit all nodes
    - Travel as node -> leaves first
    - Go to Parent, Left, Right

## DFS in a 2D World
- DFS -> Tree vs 2D (Lab 7)

| --- | Binary Tree | 2D |
| --- | --- | --- |
| Base Case | null | within bound/out of bound, obstacle, searched/visited |
| Check found | node.val == val | same -> look up in base code |
| Search | Left/Right | left, right, up, down |

