import java.util.*;
public class casecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().trim().charAt(0);
        if (Character.isUpperCase(ch)) {
            System.out.println(ch + " is an uppercase letter.");
        } else if (Character.isLowerCase(ch)) {
            System.out.println(ch + " is a lowercase letter.");
        } else {
            System.out.println(ch + " is not an alphabetic character.");
        }
        sc.close();
    }    
}
