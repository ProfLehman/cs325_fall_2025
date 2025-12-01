# Dijkstra's Algorithm

Find the **shortest path** between A and all other nodes

```mermaid
flowchart LR
    A(A-Start) -->|8| B(B)
    A(A) -->|5| E(E)
    
    B(B) --> |5| C(C)
    B(B) --> |2| D(D)
    
    C(B) --> |1| F(C)

    D(D) --> |2| C(C)
    D(D) --> |3| F(F)

    E(E) --> |2| B(B)
    E(E) --> |3| D(D)
    E(E) --> |7| F(F)
```

## Algorithm
- Set starting node A distance to 0 and all other distances to infinity
- Mark all nodes as `unvisited`
- While unvisited nodes remain
  - select unvisited node with lowest distance
  - update the distance (if lower) to adjacent nodes (update Distance, Prev and Path)
  - mark this node as visited

   





