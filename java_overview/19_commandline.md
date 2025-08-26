
# Command Line Arguments

---

## 🖥️ What are Command Line Arguments?

- Instead of asking the user for input during the program, we can **provide values when launching** the program.  
- Example:  
```

\$ python myprog.py hello 42
\$ java DemoArgs world 99

````
- Programs can read these values as **strings** and then convert them if needed.  

---

## 🐍 Python Command Line Arguments

- Found in `sys.argv` (from the `sys` module).  
- `sys.argv` is a list of strings:  
- `sys.argv[0]` → program name  
- `sys.argv[1]`, `sys.argv[2]`, … → arguments  

```python
# demo_args.py
import sys

print("Program name:", sys.argv[0])
print("Number of arguments:", len(sys.argv) - 1)

for i, arg in enumerate(sys.argv[1:], start=1):
  print(f"Argument {i}:", arg)

# Example run:
# $ python demo_args.py Norman 25
# Program name: demo_args.py
# Number of arguments: 2
# Argument 1: Norman
# Argument 2: 25
````

---

## ☕ Java Command Line Arguments

* Found in `args` parameter of `main`.
* `args` is an array of `String`.

```java
// DemoArgs.java
public class DemoArgs {
    public static void main(String[] args) {
        System.out.println("Number of arguments: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i+1) + ": " + args[i]);
        }
    }
}

// Example run:
// $ java DemoArgs Norman 25
// Number of arguments: 2
// Argument 1: Norman
// Argument 2: 25
```

---

## 🔄 Comparing

| Feature               | Python (`sys.argv`)              | Java (`args[]`)              |
| --------------------- | -------------------------------- | ---------------------------- |
| Program name included | Yes (`argv[0]`)                  | No, only arguments in `args` |
| Data type             | List of `str`                    | Array of `String`            |
| Convert to number     | `int(argv[1])`, `float(argv[2])` | `Integer.parseInt(args[0])`  |

---

## ⚠️ Common Pitfalls

* Arguments are **strings** by default. Must convert before math.
* Forgetting to check the length may cause `IndexError` (Python) or `ArrayIndexOutOfBoundsException` (Java).
* In Java, `args` does **not** include the program name (unlike Python).

---

