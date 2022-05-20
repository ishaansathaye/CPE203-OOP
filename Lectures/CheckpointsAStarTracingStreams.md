# Checkpoints, A* Tracing, and Streams

## Review: Pathing
- DFS -> Stack
- BFS -> Queue
- A* -> Priority Queue -> openList

## P4 Checkpoint
```java
private Point nextPositionDude(WorldModel world, Point destPos) {

    PathingStrategy strat = new SingleStepPathingStrategy();

    List<Point> strat.computePath.(); // path excluding start and end

    // few lines to return first step
}
```

## Tracing
| Current Node | Prior Node | Open List | Closed List | Distance from Start | Heuristic Distance | Total Distance (f = g+h)
| --- | --- | --- | --- | --- | --- | --- 
| 16 | | - | 16, | null | 0 | 5 | 5 |
| 15 | 16 | 16 | 16, 15 | null | 1 | 4 | 5 |
| 22 | 16 | 16, 15, 22 | null | 1 | 4 | 5 |
| 17 | 16 | 16, 15, 22, 17 | null | 1 | 6 | 7 |
| 10 | 16 | 15, 22, 17, 10 | null | 1 | 6 | 7 |
| 9 | 15 | 9, | 16 | 1+1 = 2 | 5 | 7 |
| 14 | 15 | 14, | 16 | 2 | 3 | 5 |
| 21 | 15 | 21, | 16 | 2 | 3 | 5 |
| next lowest f value | prior to it | put into open list | 16, 15... | - | - | - |

Brainstorms:
- What could vary?
    - breaking ties, heuristic used
- How could you get the path
    - closed list is not on path

## A * Data Structures Brainstorm
- Open List:
    - Priority Queue
    - Hash Table for look up
- Closed List:
    - Hash Table for look up