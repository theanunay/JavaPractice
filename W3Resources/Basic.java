
import java.util.*;
class Basic{
    public static void main(String[] args){
        
        // print Hello \n Name

        /* 
       // Method 1
        System.out.println("Hello\n" + "Anunay Singh");

      //  Method 2
        System.out.println("Hello");
        System.out.println("Anunay Singh");
        */

        // Q2. Sum of two numbers

        /*
        int a = 74;
        int b = 36;

        System.out.println(a + b);
        */

        // Q3. Divide two numbers

        /*
        int a = 50;
        int b = 3;

        System.out.println(a/b);
        */

        // Q4. take inputs and find product

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first input : ");
        int a = sc.nextInt();
        System.out.print("Enter second input : ");
        int b = sc.nextInt();

        int sum = a * b;

        System.out.println(a + " x " + b + " = " + sum);
        */

        // Q5. find addition, subtraction, division, product, module

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        int num1 = sc.nextInt();
        System.out.print("Input second number : ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
        
        
        

    }
}