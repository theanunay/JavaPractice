import java.util.*;
public class SumOfIntegerDigits {

    public static int sumDigits(int num){
        int i=0;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
            i++; 
        }
        System.out.println("Number of Digits : " + i);
        return sum;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Q17. Write a Java program and compute the sum of an integer's digits.
        System.out.print("Input a number : ");
        int num = sc.nextInt();

        System.out.println("The sum of digits is : " + sumDigits(num));
        

        
    }
}
