# AVL Trees and Red-Black Trees

## AVL Trees
An **AVL tree** is a self-balancing binary search tree that keeps the height difference (called the *balance factor*) between the left and right subtrees of any node to at most one. After every insertion or deletion, the tree checks whether this rule is still true—if not, it performs one or more **rotations** (simple or double) to restore balance. The result is a tree that stays very close to perfectly balanced, ensuring consistently fast lookups, insertions, and deletions—typically in *O(log n)* time.

### Rules for AVL Trees
The **rules for AVL trees** focus entirely on the balance factor: for every node,  
`balance = height(left) - height(right)` must be -1, 0, or +1.  
If this rule is violated, the tree performs one of four possible rotations (left, right, left-right, or right-left) depending on the pattern of imbalance. Each rotation rearranges a small part of the tree to restore the balance condition while preserving the binary search order.

---

## Red-Black Trees
A **Red-Black tree** is another type of self-balancing binary search tree that uses an extra “color” bit (red or black) for each node to guide its balancing. Instead of keeping the tree perfectly balanced like an AVL tree, it enforces a set of simpler color rules (e.g., no two red nodes in a row, and all paths from the root to leaves have the same number of black nodes). When an insertion or deletion breaks a rule, the tree fixes it using rotations and color changes. This approach keeps operations efficient while allowing faster insertions and deletions on average than AVL trees, though searches may be slightly slower.

### Rules for Red-Black Trees
1. Every node is either **red** or **black**.  
2. The **root** is always black.  
3. No red node can have a red parent (no two reds in a row).  
4. Every path from the root to a leaf or null child has the same number of black nodes.  
5. New nodes are inserted as **red** and recolored or rotated as needed to maintain these properties.

These rules ensure the tree remains roughly balanced, keeping its height to at most about twice the log of the number of nodes.

-- end --
