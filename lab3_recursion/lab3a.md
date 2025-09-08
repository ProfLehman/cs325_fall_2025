# Lab #3 Part A - Power and SQRT
- CS325 Data Structures  
- 6 points
- Due **Tuesday**, September 9th at 5:00 pm

---

## Purpose

The purpose of this assignment is to begin to think **recursively**. 
Recursived functions are provided to calculate powers ie. 2^3 and also
to calculate greatest common denominators.

`power`(x,y) = {1 if y=0; x if y = 1; x*`power`(x,y-1) if y > 1}

`gcd`(x,y) = {x if y=0; `gcd`(y, x%y) if y != 0}


---

## Requirements
1. Modify lab3a.java to add two additional function calls to the `power` function.
2. Create a `hand trace` **on paper** for each the the three function calls to power.
3. Modify lab3a.java to add two additional function calls to the `gcd` function.
4. Create a `hand trace`" **on paper** for each the the three function calls to gcd.

---


## Starter Code

```java
// lab3a.java
// lehman
// fall 2025
// power and GCD recursive functions
//
public class lab3a {
    public static void main(String[] args) {

        // call to power function
        System.out.println(power(2, 3));
        System.out.println();

        
        // call to gcd function
        System.out.println(gcd(10, 45));
        System.out.println();

    }

    public static int power(int x, int y) {
        System.out.println("power(" + x + "," + y + ")");
        if (y == 0)
            return 1;
        else if (y == 1)
            return x;
        else
            return x * power(x, y - 1);
    }

    public static int gcd(int x, int y) {
        System.out.println("gcd(" + x + "," + y + ")");
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

}
```

---
## Submitting your assignment

Your program must be called **lab3a.java**

Host `lab3a.java` on your GitHub account and **upload a link to your code in Moodle**

Submit your *paper hand traces* to Prof. Lehman (in class, or outside office S182)

-- end --
