# CS325 Data Structures  
**Lab #10 – Binary Trees**  
**25 points**  
**Due:** 5:00 pm, Friday, November 17, 2025 
*Must submit paper copies.*

Type or neatly hand-write your answers.  
Clearly label each answer with the corresponding question number.  
Each question is worth **3 points** unless otherwise noted.

---

## Question 1 — Binary Search Tree
Draw the **binary search tree** whose elements are inserted in the following order:

```
30, 10, 45, 50, 15, 20, 5, 35, 25
```

Then answer:
- What is the **height** of the tree?
- Is the tree **full**?
- Is the tree **complete**?

---

## Question 2 — Recursive Traversals
Write recursive *preorder*, *postorder*, and *inorder* traversal methods to display the integers in the tree from Question #1.

Assume the following node class structure:

```
node
 ├── int data
 ├── node left
 └── node right

node()
node(int)
```

Write the following method definitions:

```java
public static void preorder(node temp)

public static void postorder(node temp)

public static void inorder(node temp)
```

---

## Question 3 — Tree Traversals
Show the order in which the nodes in the tree from Question #1 are processed:

a. **Preorder** traversal  
b. **Postorder** traversal  
c. **Inorder** traversal  

---

## Question 4 — Binary Tree Using Dynamic Nodes
Show a **memory diagram** describing how the tree from Question #1 would be stored using **dynamic pointers**.

- Assume you have a `root` pointer.
- Diagram should match the style shown in class.
- Compute memory usage assuming:
  - Each pointer/reference = **4 bytes** (32-bit memory space).

---

## Question 5 — Binary Tree Using Parallel Arrays
Show a **parallel array representation** of the tree using three arrays:

```
int data[ ]
int left[ ]
int right[ ]
```

Also:
- Identify `root` and `free list` pointers.
- The **free list** should be linked using the `left` child values.
- Show **at least three free nodes**.

Example style (shown in class):

```
      H
     / \
    A   U
     \
      B
```

root = 1  
free = 5

| index | data | left | right |
|------:|------|------|-------|
| 0     | U    | -1   | -1    |
| 1     | H    | 3    | 0     | 
| 2     |      | -1   | -1    |
| 3     | A    | -1   | 4     |
| 4     | B    | -1   | -1    |
| 5     |      | 2    | -1    |

```
      H
     / \
    A   U
     \
      B
```

Compute memory usage assuming space allocated for **100 nodes**.



---

## Question 6 — Binary Tree Using a Single Array
Show the **single-array representation** (heap-like layout) of the binary tree from Question #1.

Example format (shown in class):

```
      H
     / \
    A   U
     \
      B
```

| index | data |
|------:|------|
| 0     | H    |
| 1     | A    |
| 2     | U    |
| 3     |      |
| 4     | B    |
| 5     |      |

Then compute memory usage assuming **100 total positions**.

Reference formulas:

```
Root index: 0
Parent: (index − 1) / 2
Left Child: (2 × index) + 1
Right Child: (2 × index) + 2
```

---

## Question 7 — Red-Black Trees
Insert the following numbers (in this order) into a Red-Black tree:

```
30, 10, 45, 50, 15, 20, 5, 35, 25
```

Show the tree **after each insertion**.

Then delete:

```
15, 30
```

Show the tree **after each deletion**.

> *Use online tools to verify correctness.*

---

## Question 8 — Heap Sort (4 points)
Perform **heap sort** on the following list:

```
30, 10, 45, 50, 15, 20, 5, 35, 25
```

Show a heap sort for the following items: 30, 10, 45, 50, 15, 20, 5, 35, 25. Show the logical heap throughout the
intermediate steps for creating a heap in step #1 and the intermediate steps of removing the top values in step #2.
Show steps #1 and #2 using the format on page 1 and 2 of the sample Heap Sort handout. Assume you are
starting with an array with the values 30, 10, 45, 50, 15, 20, 5, 35, 25.

Use the format shown in the heap sort handout. 



---
