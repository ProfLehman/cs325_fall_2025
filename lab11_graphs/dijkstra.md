# Dijkstra's Algorithm

Find the **shortest path** between A and all other nodes

Note: cannot be used with negative wieghts

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
- Set starting node A distance to 0 and all other distances to infinity &infin;
- Mark all nodes as `unvisited`
- While unvisited nodes remain
  - select unvisited node with lowest distance
  - update the distance (if lower) to adjacent nodes (update Distance, Prev and Path)
  - mark this node as visited

### Start
| Visited | Node | Distance | Pref | Path |
| --- | --- | --- | --- | --- |
|  | A |  |  |  |
|  | B |  |  |  |
|  | C |  |  |  |
|  | D |  |  |  |
|  | E |  |  |  |
|  | F |  |  |  |

---
### Completed
| Visited | Node | Distance | Previous | Path |
| --- | --- | --- | --- | --- |
| v1 | A | **0** |  |  |
| v3 | B | &infin;, 8, **7** | A, **E** | A->E->B |
| v5 | C | &infin;, 12, **10** | B, **D** | A->E->D->C |
| v4 | D | &infin;, **8** | **E** | A->E->D |
| v2 | E | &infin;, **5** | A | A->E |
| v6 | F | &infin;, 12, **11** | E, **D** | A->E->D->F |

-- end --













