import java.util.Scanner;

public class day2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter int, double, char, string, float, long and boolean:");

        int a = sc.nextInt();
        double b = sc.nextDouble();
        char c = sc.next().charAt(0);
        String d = sc.next();
        float f = sc.nextFloat();
        long g = sc.nextLong();
        boolean e = sc.nextBoolean();

        System.out.println("Integer: " + a);
        System.out.println("Double: " + b);
        System.out.println("Character: " + c);
        System.out.println("String: " + d);
        System.out.println("Float: " + f);
        System.out.println("Long: " + g);
        System.out.println("Boolean: " + e);

        sc.close();
    }
}