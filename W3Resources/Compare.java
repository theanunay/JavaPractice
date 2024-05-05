import java.util.*;
public class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q16. Write a Java program to compare two numbers.
        
        System.out.print("Input first number : ");
        int num1 = sc.nextInt();
        System.out.print("Input second number : ");
        int num2 = sc.nextInt();

        // Compare and display the results

        if (num1 == num2) {
            System.out.printf("%d == %d\n", num1, num2);
        }

        if (num1 != num2) {
            System.out.printf("%d != %d\n", num1, num2);
        }

        if (num1 <= num2) {
            System.out.printf("%d <= %d\n", num1, num2);
        }

        if (num1 >= num2) {
            System.out.printf("%d >= %d\n", num1, num2);
        }

        if (num1 < num2) {
            System.out.printf("%d < %d\n", num1, num2);
        }

        if (num1 > num2) {
            System.out.printf("%d > %d\n", num1, num2);
        }

    }
}
