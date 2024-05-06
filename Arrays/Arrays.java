import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Subjects : ");
        int size = sc.nextInt();
        int [] marks = new int[size];

        //input
        for (int i=0; i<size; i++){
            System.out.println("Enter the marks of " + (i+1) + "st Subject");
            marks[i] = sc.nextInt();
        }

        // output
        for (int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }


        // Linear Search
        // Find & Print the marks which is greater than 90
        // Also print the index
        for (int i=0; i<marks.length; i++){
            if (marks[i]>90){
                System.out.print("More than 90 marks : ");
                System.out.println(marks[i] + " " + i);
            }
        }

    }
}