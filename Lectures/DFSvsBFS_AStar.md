# DFS vs BFS, A* Intro

## Review
- Strategy Design Pattern   
    - Patter where you can swap out part of an algorithm at run time by passing in a function to a bigger context function
- Pattern for P4
    - We will change nextPosition (context) to use pathing strategy

## DFS vs BFS
- Pro
    - wil be able to find path 
- Con
    - will be inefficient 

## BFS - Breadth First Search
- Dijkstra
    - modification of BFS
    - used for shortest path
- Iterative Implementations
    - BFS
        - **Natural Structure** -> Queue (FIFO) -> enforces BFS

## DFS
- Iteratively
    - Change queue to stack
- Recursion
    - demo from last class

## Using BFS for our Project
- Pro
    - better for shortest path
- Con
    - still too slow for realtime graphics

## P4
- A* is a modification of BFS
    - Iterative (mostly)
    - heuristic -> estimation
    - work in real-time

## A* Overview
- **Heuristic algorithm**
    - shortcut to help us more quickly find path -> "estimate"
    - A*'s Heuristic
        - estimate distance from current node to the goal
    - Ways to calculate:
        - distance formula -> manhattan distance
- Steps
    - Start: 16
    - Goal: 25
    - Current 16
    Open List: closed list (visited)
    1. Make star node current
    2. Get valid neighbors of start / current node
        - 15, 22, 17, 10
        - valid if not occupied, out of bounds, or in closed list...
    3. Calculate AND    store lots of data for each neighbor and add to open list (data structure?)
        - heuristic
        - how far we have traveled
- Current: 16
- Neighbors: 15, 10, 17, 22
    - Each one calculate
        - G -> how far I have traveled from the start node
        - H -> heuristic - estimate how far I have to travel to get to goal
        - F -> G + H
    - Open List: 15, 17, 22, 10
- Algorithm
    1. Choose/know starting and ending points of the path
    2. Add start node to the open list and mark it as the current node
    3. Analyze all valid adjacent nodes that are not on the closed list. For each valid neighbor:
        - Determine distance from start node (g value)
            - g = distance of current node from start (known NOT heuristic) + distance from current node to adjacent
        - If the node is already on the open list
            - If the calculated g value is better than a previously calculated g value, replace the old g value with the new one and proceed to next step.  Otherwise, skip to above step for the next node.
        - Estimate distance of adjacent node to the end point (h)
        - This is called the heuristic.  It can be Euclidean distance, Manhattan distance, etc.
        - Add g and h to get an f value
        - Save the prior node of this neighbor (prior node is ‘current node’)
        - Add node to open list (replacing the node if there already was one in step b)
    4. Move the current node to the closed list
    5. Choose a node from the open list with the smallest f value and make it the current node
    6. Go to step 3 
    - Repeat until within reach of the goal or you can no longer search. 