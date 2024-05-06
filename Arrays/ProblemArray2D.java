import java.util.Scanner;

public class ProblemArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows : ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of rows : ");
        int cols = sc.nextInt();

        int[][] marks = new int[rows][cols];
        System.out.print("Enter the marks : ");

        // Taking input
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++ ){
                marks[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        // Printing Output
        System.out.println("Output of the Marks : ");
        for (int i=0; i<rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
