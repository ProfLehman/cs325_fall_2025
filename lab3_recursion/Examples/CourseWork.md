# CourseWork (hours recursion)

This example uses recursion to simulate progressing toward a graduation credit threshold. Starting from a given number of credit hours, it calls itself with `hours + 1` until the base case is met (at or beyond 128 hours). It prints a message before and after the recursive call to show the call stack growth and unwind.

```java
public class CourseWork {
    public static void courseWork(int hours) {
        System.out.println("*** Beginning hours = " + hours);

        if (hours >= 128) { // base case
            System.out.println(hours + " hours, You can graduate!");
        } else {
            System.out.println(hours + " hours, More course work needed ...");
            courseWork(hours + 1); // recursive call
        }

        System.out.println("*** End hours = " + hours);
    }

    public static void main(String[] args) {
        courseWork(126);
    }
}
```