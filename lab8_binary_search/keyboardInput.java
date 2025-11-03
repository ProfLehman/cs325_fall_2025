
import java.util.Scanner;

// keyboardInput.java
// fall 2025
// j.l. lehman
// demonstrates keyboard input (int and String) and converting number to int

public class keyboardInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // *** enter int ***
        System.out.print("Enter number: ");
        int number = Integer.parseInt(input.nextLine());
        System.out.println("Number entered was " + number);
        System.out.println();

        System.out.print("Enter 2nd number: ");
        number = Integer.parseInt(input.nextLine());
        System.out.println("2nd Number entered was " + number);
        System.out.println();

        // *** enter text ***

        System.out.print("Did this help? Y or N: ");
        String answer = input.nextLine();
        System.out.println("Help response was " + answer);

        if (answer.equalsIgnoreCase("Y"))
            System.out.println("Great ...");
        else
            System.out.println("Time to ask questions ...");

    }
}