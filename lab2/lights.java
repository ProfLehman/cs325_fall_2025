// lights.java
// fall 2019
// dr. lehman
// cs325 in-class example to demonstrate problem solving process
// and limits of computing

public class lights {

    public static void main(String[] args) {

        System.out.println("Max Size of array should be int max = " + Integer.MAX_VALUE);

        // try values such as:
        // 2147483647 or 2147483646 (note: use Max_Value - 1 due to array size)
        // 1,000,000
        // 10,000,000
        // 100,000,000
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
    } // main

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
    } // showLights

} // class
