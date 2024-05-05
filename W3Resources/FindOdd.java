public class FindOdd {
    public static void main(String[] args) {
        // Q1. Print number 10 to 100.
        // Q2. Find Odd numbers between 10 to 100.
        // Q3. Odd numbers greater than 50.
        // Q4. Find the sum of odd numbers between 10 to 100 and greater than 50.

        int sum = 0;
        for(int i=10; i<=100; i++){
            System.out.println("Numbers 10 to 100 : " +i);
            if (i%2 != 0) {
                System.out.println("Odd Numbers : " +i);
                if (i<50) {
                    System.out.println("Odd numbers greater than 50 :" +i);
                    sum += i;
                }
            }
        }
        System.out.println("Sum of odd numbers : " + sum);

    }
}
