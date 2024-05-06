import java.util.Scanner;

public class SpiralOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Rows & Columns : ");
        int row = sc.nextInt();
        int column = sc.nextInt();

        // Q. Print the spiral order matrix as output for a given matrix of numbers.
        int [][] matrix = new int[row][column];

        // Input
        // Rows
        for (int i=0; i<row; i++){
            // Columns
            for (int j=0; j<column; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // Printing Matrix in Spiral Order

        System.out.println("Printing Output : ");
        // Important Variables
        int rowStart = 0;
        int rowEnds = row-1;
        int columnStart = 0;
        int columnEnds = column-1;

        while(rowStart <= rowEnds && columnStart <= columnEnds){

            // 1
            for(int col=columnStart; col<=columnEnds; col++){
                System.out.print(matrix[rowStart][col] + " ");
            }

            rowStart++;

            // 2
            for (int ro=rowStart; ro<=rowEnds; ro++){
                System.out.print(matrix[ro][columnEnds] + " ");
            }
            columnEnds--;

            // 3
            for (int col=columnEnds; col>=columnStart; col--){
                System.out.print(matrix[rowEnds][col] + " ");
            }
            rowEnds--;

            // 4
            for (int ro=rowEnds; ro>=rowStart; ro--){
                System.out.print(matrix[ro][columnStart] + " ");
            }
            columnStart++;

            System.out.println();
        }

    }
}
