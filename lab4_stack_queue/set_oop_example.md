
# SetTest.java
```java
public class SetTest
{
    public static void main(String[] args) {

        SetCharArray set1 = new SetCharArray();

        System.out.println( set1 );
        System.out.println( set1.toString() );
        System.out.println( "size = " + set1.size() ); //0
        System.out.println();

        set1.add('A');
        System.out.println( set1 );
        System.out.println( "size = " + set1.size() ); //1
        System.out.println();

        set1.add('B');
        set1.add('C');
        set1.add('Y');
        System.out.println( set1 );
        System.out.println( "size = " + set1.size() ); //3
        System.out.println();

        System.out.println( "find A = " + set1.member('A') ); //true
        System.out.println( "find J = " + set1.member('J') ); //false
        System.out.println();

        SetCharArray set2 = new SetCharArray();
        set2.add('B');
        set2.add('Y');

        set2.add('C');

        set2.add('D');

        System.out.println( set2 );
        System.out.println( "size = " + set2.size() );
        System.out.println();

        System.out.println( set1.intersect(set2) );

        System.out.println();
        System.out.println( set2 );
        set2.remove( 'Y' );
        System.out.println( set2 );

    }

}
```

---
```java
[basinger@ada cs325]$ cat SetCharArray.java
//SetCharArray.java
//dr. lehman
//fall 2025
//class to implement Set ADT with array
//

public class SetCharArray {

    //data
    private char data[];
    private int MAX;
    private int size;

    //methods

    /**
     * create empty Set with max size 5
     */
    public SetCharArray() {
        MAX = 5;
        data = new char[MAX];
        size = 0;

        for (int i=0; i<MAX; i++)
            data[i] = '?';
    }

    /**
     * create Set with max size m
     *
     * @param m max size of array
     */
    public SetCharArray(int m) {
        MAX = m;
        data = new char[MAX];
        size = 0;

        for (int i=0; i<MAX; i++)
            data[i] = '?';
    }

    /**
     * add char to Set
     *
     * @param v char to add
     */
    public void add(char v) {
        if (!full()) {

            int i = 0;
            boolean found = false;
            while (i < MAX && found == false)
            {
                if (data[i] == '?')
                {
                    data[i] = v;
                    size++;
                    found = true;
                }
                i = i + 1;
            }

        }
    }

    /**
     * see if c is in Set
     */
    public boolean member(char c) {
        boolean found = false;

        if (!empty())
        {
            int i = 0;
            while (i < MAX && found == false)
            {
                if (data[i] == c)
                {
                    found = true;
                }
                i = i + 1;
            }
        }

        return found;
    }


    /**
     * remove last item added to Set
     */
    public void remove(char c) {

        boolean found = false;

        if (!empty())
        {
            int i = 0;
            while (i < MAX && found == false)
            {
                if (data[i] == c)
                {
                    data[i] = '?';
                    found = true;
                }
                i = i + 1;
            }
        }
    }

    /**
     * returns empty if not items on status
     *
     * @return true if Set empty
     */
    public boolean empty() {
        return size == 0;
    }

    /**
     * returns true if size equals max
     *
     * @return true if Set is full
     */
    public boolean full() {
        return size == MAX;
    }

    /**
     * returns number of items stored in Set
     *
     * @return number of items stored in Set
     */
    public int size()
    {
        return size;
    }

    /**
     * use with println to display set
     *
     * @return set as a String
     */
    public String toString()
    {
        String result = "Set: ";
        boolean first = true;

        for (int i=0; i<MAX; i++)
        {
            if (data[i] != '?')
                if (first)
                {
                    result = result + data[i];
                    first = false;
                }
                else
                    result = result + ", " + data[i];
        }
        return result;
    }

    /**
     * intersect
     *
     * @return SetCharArray
     */
    public SetCharArray intersect(SetCharArray temp)
    {
        SetCharArray result = new SetCharArray(MAX);

        //add all items from this that are in temp
        for (int i=0; i<MAX; i++)
        {
            if (data[i] != '?')
                if (temp.member( data[i] ) )
                    result.add( data[i] );
        }

        return result;
    }


}//class
```
-- end --
