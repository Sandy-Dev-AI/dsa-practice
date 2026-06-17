import java.util.*;

public class day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                System.out.println(c + " is an uppercase letter.");
            } else if (Character.isLowerCase(c)) {
                System.out.println(c + " is a lowercase letter.");
            } else {
                System.out.println(c + " is not a letter.");
            }
        }

        while (true) {
            System.out.println("This will run indefinitely.");
            break;
        }

        do {
            System.out.println("This is a do-while loop. It will execute at least once.");
        } while (false);

        scanner.close();
    }
}