/*
    Nut.java
	Fall 2021
	Lehman
	
	Demonstrates use of circular queue for Nut in drive ya nuts puzzle
	
*/
public class Nut {

    public CircularCharQueue data;

    // default constructor
    public Nut(char a, char b, char c, char d, char e, char f) {
        data = new CircularCharQueue();
        data.enqueue(a);
        data.enqueue(b);
        data.enqueue(c);
        data.enqueue(d);
        data.enqueue(e);
        data.enqueue(f);
    }

    public void rotateLeft() {
        data.next();
    }

    public void rotateRight() {
        for (int i = 0; i < 5; i++)
            data.next();
    }

    public String toString() {

        char a = data.front();
        data.next();
        char b = data.front();
        data.next();
        char c = data.front();
        data.next();
        char d = data.front();
        data.next();
        char e = data.front();
        data.next();
        char f = data.front();
        data.next();

        String r = "";

        r += "       +-------+\n";
        r += "      /    " + a + "    \\\n";
        r += "     /  " + f + "     " + b + "  \\\n";
        r += "    /      _      \\\n";
        r += "   +     [ _ ]    +\n";
        r += "    \\             /\n";
        r += "     \\  " + e + "     " + c + "  /\n";
        r += "      \\    " + d + "    /\n";
        r += "       +-------+\n";

        return r;
    }

    public static void main(String[] args) {

        Nut sample = new Nut('1', '2', '3', '4', '5', '6');

        System.out.println(sample);

        sample.rotateRight();
        System.out.println(sample);

        sample.rotateLeft();
        System.out.println(sample);

        System.out.println("**************");

        for (int x = 0; x < 6; x++) {
            sample.rotateRight();
            System.out.println(sample);
        }

    }
}
