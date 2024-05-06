import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many person is there : ");
        int size = sc.nextInt();
        String[] name = new String[size];

        // Input
        for (int i=0; i<name.length; i++){
            System.out.print("Enter name: ");
            name[i] = sc.nextLine();
        }

        // Output
        for (int i=0; i<name.length; i++){
            System.out.println(name[i]);
        }
    }
}
