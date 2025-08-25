# Using the Shell (Command Line)

Both **Python** and **Java** programs can be run from the command line (shell).  
This page shows how to do it on **Windows**, **macOS**, or **Linux**.

---

## Python

Python does not need a separate compile step.

```bash
# Run a Python program
python hello.py
````

---

## Java

Java programs must first be **compiled** into bytecode (`.class` files).
Then the **Java Virtual Machine (JVM)** runs them.

```bash
# Step 1: Compile (creates HelloWorld.class)
javac HelloWorld.java

# Step 2: Run (no .class or .java in the name)
java HelloWorld
```

---

## Key Differences

| Step         | Python            | Java                                 |
| ------------ | ----------------- | ------------------------------------ |
| Save file as | `hello.py`        | `HelloWorld.java` (must match class) |
| Compile      | Not needed        | `javac HelloWorld.java`              |
| Run          | `python hello.py` | `java HelloWorld`                    |
| Output       | Hello World       | Hello World                          |

---

## Why This Matters

* Python is **interpreted** → runs directly from source.
* Java is **compiled** → first converted to bytecode, then run on the JVM.
* Both approaches allow programs to be run on many different computers.

---
