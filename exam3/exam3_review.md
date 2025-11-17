# CS 325 Exam #3 Review – Fall 2023
**125 Points**

This exam will cover **searching, trees, heaps, and hashing**.

You may use a **single 8.5" × 11" sheet (front/back)** as a reference guide during the exam. Students must use their own reference sheet.

Also review your **class notes** and readings from this course (selected topics from Chapters **5, 6, 7, 9, 10, and 11**).

---

## Trees

- Binary Tree, Binary Search Tree, root, parent, child, level, height, full, complete (no holes), perfect  
- Traverse a binary tree using **pre-order**, **in-order**, and **post-order** traversals  
- Determine the **number of nodes at a given level** and **total nodes** in a tree given the number of levels  
- Recognize balancing techniques (**Red-Black**, **AVL**) and their importance  
  - Big-O search performance: **O(log₂ N)**  
- Tree Implementations  
  - Dynamic structure (**node**)  
  - Array of nodes (**info, left, right**) including root and free list  
  - Single array (non-linked array) using formulas to compute **left child**, **right child**, and **parent**  
- Describe **Heap Sort** including big-O analysis  
  - Best, average, worst case: **O(N log₂ N)**  
- Use a **heap as a priority queue**

---

## Hashing

- Concept of hashing including big-O analysis (**O(1)**)  
- Hash key, Hash functions (**mod**, **mid-square**, **string**)  
- Handling additions and collisions  
  - **Linear probing**, **deletions**  
- **Chaining** vs. **Probing**

---

## Memory Requirements  
(assume 32-bit address space)

- Address: **4 bytes**  
- `int`: **4 bytes**  
- `double`: **8 bytes**  
- `char`: **1 byte**

---

## Sample Data for Review

