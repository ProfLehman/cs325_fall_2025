
# Two-Dimensional Arrays

---

## 📊 Why 2D Arrays?

- Useful for **matrices, tables, game boards, spreadsheets**.  
- Think of them as “arrays of arrays.”  
- Access requires **two indexes**: row and column.  

---

## 🐍 Python Nested Lists

- Python uses **lists of lists** instead of true 2D arrays.  
- Flexible but must be careful with indexing.

```python
# create a 2D list (2 rows, 3 columns)
matrix = [
    [1, 2, 3],
    [4, 5, 6]
]

print(matrix[0][0])  # first row, first column = 1
print(matrix[1][2])  # second row, third column = 6

# loop through rows and columns
for r in range(len(matrix)):
    for c in range(len(matrix[r])):
        print(matrix[r][c], end=" ")
    print()
````

---

## ☕ Java 2D Arrays

* Java supports arrays with multiple dimensions.
* Must specify number of columns.

```java
public class DemoArray2 {
    public static void main(String[] args) {
        // 2 rows, 3 columns
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println(matrix[0][0]); // 1
        System.out.println(matrix[1][2]); // 6

        // loop through rows and columns
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## 🔄 Key Operations

| Task           | Python (list of lists)    | Java (2D array)                  |
| -------------- | ------------------------- | -------------------------------- |
| Create         | `[[1,2,3],[4,5,6]]`       | `int[][] a = {{1,2,3},{4,5,6}};` |
| Access element | `a[1][2]`                 | `a[1][2]`                        |
| Rows count     | `len(a)`                  | `a.length`                       |
| Cols count     | `len(a[0])`               | `a[0].length`                    |
| Nested loop    | `for r in range(len(a)):` | `for (int r=0; r<a.length; r++)` |

---

## ⚠️ Common Pitfalls

* **Python**: lists can be **ragged** (rows of different lengths).
* **Java**: must define the number of columns when declaring `new int[rows][cols]`.
* Off-by-one errors are easy when looping rows and columns.

---

