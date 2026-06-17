import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms for Fibonacci series:");
        int n = sc.nextInt();
        int first = 0, second = 1;
        System.out.println("Fibonacci Series: " + first + ", " + second);
        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.println(", " + next);
            first = second;
            second = next;
        }
        sc.close();
    }

    
}
