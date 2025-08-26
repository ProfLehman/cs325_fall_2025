# Getting User Input

---

## ⌨️ Input Basics

### Python
- Use the built-in `input()` function.  
- Always returns a **string**, so you must convert (cast) to `int`, `float`, etc. if needed.

```python
# demo_input.py
name = input("Enter your name: ")
print("Hello", name)

age = int(input("Enter your age: "))   # convert to integer
print("Next year you will be", age + 1)
````

---

### Java

* Use a `Scanner` object to read from `System.in`.
* Must import: `import java.util.Scanner;`

```java
// DemoInput.java
import java.util.Scanner;

public class DemoInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Next year you will be " + (age + 1));

        sc.close();
    }
}
```

---

## 🔄 Data Conversion

* **Python:**

  * `int("42")` → 42
  * `float("3.14")` → 3.14
* **Java:**

  * `nextInt()`, `nextDouble()` read numeric types directly.
  * To convert strings: `Integer.parseInt("42")`, `Double.parseDouble("3.14")`.

---

## ⚠️ Common Pitfalls

* **Python**: Forgetting to cast to `int`/`float` before math.

  ```python
  x = input("Enter a number: ")
  print(x + 5)   # ❌ error, string + int
  ```

* **Java**: Mixing `nextInt()` and `nextLine()`.

  * `nextInt()` leaves the newline in the buffer.
  * Fix: add an extra `nextLine()` to consume the leftover newline.

---

