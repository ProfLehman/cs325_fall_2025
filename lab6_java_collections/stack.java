
import java.util.*;

//stack.java
//fall 2021
//prof. lehman
//demonstrates use of generic type to define stack class
//
//https://www.techiedelight.com/creating-generic-array-java/ (link no longer valid 6 October 2025)

public class stack<T> {

    Object data[];
    int top;

    public stack() {
        data = new Object[5];
        top = -1;
    }

    public void push(T item) {
        if (top < data.length) {
            top++;
            data[top] = item;
        }
    }

    public void pop() {
        if (top >= 0)
            top--;
    }

    public T top() {
        @SuppressWarnings("unchecked")
        T temp = (T) data[top];
        return temp;
    }

    public String toString() {
        String result = "top: ";

        for (int i = top; i >= 0; i--) {
            @SuppressWarnings("unchecked")
            T temp = (T) data[i];
            result += temp + " ";
        }

        return result;
    }

    public static void main(String args[]) {

        stack<Character> s = new stack<Character>();
        s.push('A');
        s.push('B');
        s.push('C');
        System.out.println(s);
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        System.out.println(s);
        System.out.println();
        System.out.println();

        stack<Integer> s2 = new stack<Integer>();
        s2.push(1);
        s2.push(2);
        s2.push(3);
        System.out.println(s2);
        System.out.println(s2.top());
        s2.pop();
        System.out.println(s2.top());
        System.out.println(s2);
        System.out.println();

        stack<String> s3 = new stack<String>();
        s3.push("red");
        s3.push("green");
        s3.push("blue");
        System.out.println(s3);
        System.out.println(s3.top());
        s3.pop();
        System.out.println(s3.top());
        System.out.println(s3);
        System.out.println();

    }

}
