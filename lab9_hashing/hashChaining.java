/*
 * hashChaining.java
 * prof. lehman
 * fall 2025
 * 
 * class implements hashing with chaining
 * uses node.java as a storage structure
 */
public class hashChaining {

    // data
    node data[]; // array of nodes
    int cc[]; // counts for items hashed
    int MAX; // hash array storage size

    // constructor
    public hashChaining(int N) {
        MAX = N;
        data = new node[MAX];
        cc = new int[MAX];
    }

    // *** hash function
    public int hash(long key) {

        // mid squares hash
        // long temp = key * key * key;
        // String tempString = Long.toString(temp);
        // String sub_string = tempString.substring(2, 4);
        // key = Long.parseLong(sub_string);

        // string hash
        // String tempString = Long.toString(key);
        // long temp_key = 0;
        // int m = 1;
        // for (int x = 0; x < tempString.length(); x++) {
        // int temp = m * (int) tempString.charAt(x);
        // //m++;
        // temp_key = temp_key + temp;
        // }
        // key = temp_key;

        // last step, you must mod by array length
        // note: mod ie. % does not work with long
        // thus mod = key - (key/max) * max
        return (int) (key - ((key / MAX) * MAX));

    }
    // *******************************************

    // insert
    public void insert(long key) {

        int initialPosition = hash(key);
        // System.out.println(initialPosition);
        cc[initialPosition]++;

        // see if empty
        if (data[initialPosition] == null) {
            data[initialPosition] = new node(key, null);
            System.out.println(key + " Added 1st key at " + initialPosition);
        } else // not empty 1 or more nodes already there
        {
            // add new node to beginning of list for O(1) performance
            node temp = new node(key, null);
            temp.next = data[initialPosition];
            data[initialPosition] = temp;
            System.out.println(key + " Added 1+ key at " + initialPosition);
        }

    }

    // find
    public boolean find(int key) {

        boolean found = false;

        int initialPosition = hash(key);

        // no node at position
        if (data[initialPosition] == null)
            found = false;
        else {
            // 1+ nodes
            // temp is a reference to first node
            node temp = data[initialPosition];
            found = false;
            while (temp != null && found != true) {
                if (temp.data == key)
                    found = true;
                else
                    temp = temp.next; // advance to next node
            }
        }

        return found;
    }

    // showStats
    public void showStats() {

        System.out.println("\nArray size N: " + MAX);
        System.out.println();

        // summarize hashing conflicts
        int stats[] = new int[20];

        for (int x = 0; x < MAX; x++) {
            if (cc[x] < 20)
                stats[cc[x]]++;
            else
                System.out.println("higher:" + cc[x]);
        }

        // double check stats to make sure they total items hashed
        int tot = 0;
        for (int y = 0; y < 20; y++) {
            tot = tot + stats[y] * y;
            System.out.printf("locations with %2d items: %d\n", y, stats[y]);
        }
        System.out.println();
        System.out.println("Total values hashed: " + tot);
        System.out.println();
        // note: when looking at the totals at each level, if there are 2 with 2
        // conflicts, that represents
        // four items

    }

}// class
