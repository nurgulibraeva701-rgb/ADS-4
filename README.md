# ads4.
# Assignment 4 – Graphs

## Task 1 – Depth First Search (DFS)

Graph adjacency lists:

A: C B D

B: A C E G

C: A B D

D: C A

E: G F B

F: G E

G: F B


Source node: A

### DFS Traversal Order

A → C → B → E → G → F → D

### Detailed DFS Trace

1. Start at A
   Visited: A

2. From A go to C
   Visited: A, C

3. From C go to B
   Visited: A, C, B

4. From B go to E
   Visited: A, C, B, E

5. From E go to G
   Visited: A, C, B, E, G

6. From G go to F
   Visited: A, C, B, E, G, F

7. F has no unvisited adjacent vertices, backtrack to G

8. G has no unvisited adjacent vertices, backtrack to E

9. E has no unvisited adjacent vertices, backtrack to B

10. B has no more unvisited vertices, backtrack to C

11. From C go to D
    Visited: A, C, B, E, G, F, D

12. D has no unvisited adjacent vertices. DFS completed.

---

## Task 2 – Breadth First Search (BFS)

Source node: A

### BFS Traversal Order

A → C → B → D → E → G → F

### Detailed BFS Trace

1. Start at A
   Queue: [A]
   Visited: A

2. Remove A from queue
   Add neighbors C, B, D
   Queue: [C, B, D]
   Visited: A, C, B, D

3. Remove C from queue
   Its neighbors are already visited
   Queue: [B, D]

4. Remove B from queue
   Add neighbors E and G
   Queue: [D, E, G]
   Visited: A, C, B, D, E, G

5. Remove D from queue
   No new vertices added
   Queue: [E, G]

6. Remove E from queue
   Add neighbor F
   Queue: [G, F]
   Visited: A, C, B, D, E, G, F

7. Remove G from queue
   No new vertices added
   Queue: [F]

8. Remove F from queue
   Queue becomes empty

BFS completed.

# Task 4 – Shortest Path Problem

Using Dijkstra’s shortest-path algorithm, determine the shortest path from Edinburgh to Dundee.

## Steps of Dijkstra’s Algorithm

1. Start from Edinburgh.
2. Assign distance 0 to Edinburgh and infinity to all other cities.
3. Visit the nearest unvisited city each time.
4. Update distances to neighboring cities.
5. Continue until Dundee is reached.

## Shortest Path

Edinburgh → Perth → Dundee

## Total Distance

The total distance is the sum of:

* Edinburgh to Perth
* Perth to Dundee

