import java.util.*;
   public class reverse {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number to reverse:");
      long a = sc.nextLong();
      long reversed = 0;
        while (a != 0) {
             long digit = a % 10;
             reversed = reversed * 10 + digit;
             a /= 10;
     }
     sc.close();
     System.out.println("Reversed number: " + reversed);         
    
           }
                }
