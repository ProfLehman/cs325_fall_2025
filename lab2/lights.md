# CS 325 – In-Class Example  

**lights.java – Fall 2019**  
Dr. Lehman  

In-class example to demonstrate the **problem-solving process** and **limits of computing**.  

Inspired by:  
- ["Car Talk Puzzler"](http://www.cartalk.com/content/hall-lights)  
- [LiveCode mailing list discussion](http://lists.runrev.com/pipermail/use-livecode/2005-November/070716.html)  

---

## Pseudocode

```C

get N

create boolean array of size N+1 to simplify referring to indexes
(index 0 not used)

set all values in array to false

For a = 1 to N step 1   (includes N, i.e. <= N)
For b = a to N step a
if array\[b] is true, set false
else set true

For x = 1 to N step 1
If array\[x] is true, then display x

````

---

## Java Implementation

```java
// lights.java
// fall 2019
// dr. lehman
// cs325 in-class example to demonstrate problem solving process
// and limits of computing

public class lights {

    public static void main(String[] args) {

        System.out.println("Max Size of array should be int max = " + Integer.MAX_VALUE);

        // try values such as:
        //   2147483647 or 2147483646 (note: use Max_Value - 1 due to array size)
        //   1,000,000
        //   10,000,000
        //   100,000,000
        //
        // Questions:
        // - At what point does it take "too long?"
        // - At what point do you get memory errors?
        //
        // To allocate more memory when running program:
        // java -Xmx3g lights 2147483000

        // default N
        int N = 100;

        // update with command line argument if present
        System.out.println("# arguments passed = " + args.length);
        if (args.length > 0) {
            N = Integer.parseInt(args[0]);
        }
        System.out.println("N = " + N);

        showLights(N);
    }

    public static void showLights(int max) {
        int N = max;

        // create array of size N+1
        boolean data[] = new boolean[N + 1];

        // initialize all to false
        for (int x = 1; x <= N; x++)
            data[x] = false;

        // toggle lights
        for (int a = 1; a <= N; a++) {
            for (int b = a; b <= N; b = b + a) {
                data[b] = !data[b];
            }
        }

        // display all "on" lights
        for (int x = 1; x <= N; x++) {
            if (data[x] == true)
                System.out.printf("%d square root is %.0f\n", x, Math.sqrt(x));
        }
    }
}
```

---

## Sample Run (N = 20)

```
N = 20
1 square root is 1
4 square root is 2
9 square root is 3
16 square root is 4
```

---

## Observations

* The lights left **on** correspond to the **perfect squares**.
* Demonstrates both:

  * Computational limits (time and memory constraints).
  * How algorithm design impacts efficiency.

---
-- end --
Would you like me to also generate a **diagram** (e.g., showing the lights toggling pattern row by row) in Markdown tables so students can *see* how the toggling produces the perfect squares?
```
