import java.util.*;
public class occurence {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
            long n = sc.nextLong(); //using long to handle larger numbers
        System.out.println("Enter the digit to search for");
        int searchDigit = sc.nextInt();
        sc.close();
        
        int count = 0;
        long temp = Math.abs(n); // Use absolute value to handle negative numbers
        
        // Extract each digit using modulo and division
        while (temp > 0) {
            int digit = (int)(temp % 10); //typecast to int since we are only interested in the last digit and changed it from long to int
            if (digit == searchDigit) { 
                count++;
            }
            temp = temp / 10; // Remove the last digit
        }
        
        System.out.println("The digit " + searchDigit + " occurs " + count + " time(s) in " + n); // Output the result
    }
  }
