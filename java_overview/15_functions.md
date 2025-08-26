# Functions & Methods

---

## 🔧 Why Functions?

- Break problems into smaller, reusable parts.  
- Make programs easier to read and debug.  
- Functions/methods can:
  - **Take inputs** (parameters)  
  - **Return values** (results)  

---

## 🐍 Python Functions

### Defining and Calling
```python
# simple function without return
def greet():
    print("Hello from a function!")

greet()   # call the function
````

### With Parameters

```python
def greet(name):
    print("Hello", name)

greet("Norman")
```

### With Return Value

```python
def get_big(x, y):
    if x > y:
        return x
    else:
        return y

print("Bigger =", get_big(20, 30))
```

### Pass by Value / Reference

* Python passes **references** to objects, but small types (int, str, bool) behave like “by value” because they are immutable.
* Example: swapping won’t affect outside unless you return the result.

```python
def swap(x, y):
    return y, x

a, b = 10, 20
a, b = swap(a, b)
print(a, b)   # 20, 10
```

---

## ☕ Java Methods

### Defining and Calling

```java
public class DemoFunctions {
    public static void greet() {
        System.out.println("Hello from a method!");
    }

    public static void main(String[] args) {
        greet();   // call method
    }
}
```

### With Parameters

```java
public static void greet(String name) {
    System.out.println("Hello " + name);
}

public static void main(String[] args) {
    greet("Norman");
}
```

### With Return Value

```java
public static int getBig(int x, int y) {
    if (x > y)
        return x;
    else
        return y;
}

public static void main(String[] args) {
    System.out.println("Bigger = " + getBig(20, 30));
}
```

### Pass by Value / Reference

* Java **always passes by value**.
* For objects, the *reference* itself is passed by value → object contents can be changed, but the reference can’t be reassigned.
* Example with swap:

```java
public static void swap(int x, int y) {
    int temp = x;
    x = y;
    y = temp;
}

public static void main(String[] args) {
    int a = 10, b = 20;
    swap(a, b);
    System.out.println(a + " " + b);  // still 10, 20
}
```

---

## ⚠️ Common Pitfalls

* **Python**:

  * Forgetting `return` means the function gives back `None`.
  * Indentation is required.

* **Java**:

  * Must declare return type (`int`, `void`, etc.).
  * Method must be inside a class.
  * `main` must be `public static void main(String[] args)`.

---
