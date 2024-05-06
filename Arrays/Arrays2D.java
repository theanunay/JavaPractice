import java.util.Scanner;

public class Arrays2D {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter number of Columns : ");
        int cols = sc.nextInt();

        int [][] table = new int[rows][cols];

        // Taking input from the user
        //outer loop for rows
        for(int i=0; i<rows; i++){
            //Inner loop for columns
            for (int j=0; j<cols; j++){
                table[i][j] = sc.nextInt();
            }
//            System.out.println();
        }

        // Find the value of x and print the location
        System.out.print("Enter the value to find : ");
        int value = sc.nextInt();

        // Printing Output
        System.out.println("Output : ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        // Finding and printing the location
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                if (table[i][j] == value){
                    System.out.println("Value found at the location (" + i + ", " + j + ")");
                }
            }
        }
    }
}
