
# One-Dimensional Arrays

> Goal: Learn how to store and process multiple values of the same type using **arrays** (Java/C++) and **lists** (Python).

---

## 📦 Why Arrays?

- Arrays and lists let you keep a **collection of values** together.  
- Instead of declaring 10 separate variables, you can store them all in one structure and use an **index** to access each value.  
- Indexes usually start at **0**.

---

## 🐍 Python Lists

- Python doesn’t have fixed-size arrays; it uses **lists**.  
- Lists can grow/shrink and hold different types, but usually we store the same type.

```python
# create a list
numbers = [10, 25, 50, 35]

print(numbers[0])  # first element (10)
print(numbers[2])  # third element (50)

# change an element
numbers[1] = 99

# loop through the list
for value in numbers:
    print(value)

# length of list
print("size =", len(numbers))
````

---

## ☕ Java Arrays

* Arrays have a **fixed size**.
* Use `[]` to declare and access values.

```java
public class DemoArray1 {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 50, 35};   // initialize

        System.out.println(numbers[0]);  // first element
        System.out.println(numbers[2]);  // third element

        numbers[1] = 99;  // change an element

        // loop with index
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // enhanced for loop
        for (int value : numbers) {
            System.out.println(value);
        }

        System.out.println("size = " + numbers.length);
    }
}
```

---

## 🔄 Key Operations

| Task   | Python (list) | Java (array)         |
| ------ | ------------- | -------------------- |
| Create | `[1, 2, 3]`   | `int[] a = {1,2,3};` |
| Access | `a[0]`        | `a[0]`               |
| Change | `a[1] = 5`    | `a[1] = 5;`          |
| Length | `len(a)`      | `a.length`           |
| Loop   | `for x in a:` | `for (int x : a)`    |

---

## ⚠️ Common Pitfalls

* **Index Out of Bounds**:

  * Python: `IndexError` if you access `a[5]` in a 4-element list.
  * Java: `ArrayIndexOutOfBoundsException`.
* Indexing starts at **0**, not 1.
* Java arrays cannot change size after creation.

---


