import java.util.*;
    public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();
        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();
        System.out.println("Choose an operation (+, -, *, /):");
        char operation = sc.next().charAt(0);
        double result = 0;
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid operation. Please choose +, -, *, or /.");
            sc.close();
            return;
        }
        
        System.out.println("Result: " + result);
        sc.close();
    }
}
