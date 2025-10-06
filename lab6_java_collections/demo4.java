import java.util.Stack;

// removeStackVowels.java
// prof. lehman
// 9 Oct 2023
// demonstrates using java collections Stack
// to remove vowels from stack

public class demo4 {

    public static void main(String[] args) {

        // remove vowels from stack
        Stack<Character> stack = new Stack<Character>();
        Stack<Character> stack2 = new Stack<Character>();

        stack.add('m');
        stack.add('a');
        stack.add('x');
        stack.add('e');
        System.out.println(stack);

        while (stack.isEmpty() == false) {
            if ("aeiou".indexOf(stack.peek()) == -1)
                stack2.push(stack.peek());
            stack.pop();
        }

        while (stack2.isEmpty() == false) {
            stack.push(stack2.peek());
            stack2.pop();
        }

        System.out.println(stack);

    }

}
