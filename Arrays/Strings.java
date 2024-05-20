import java.util.*;
import java.lang.*;
public class Strings {
    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "hello";
        System.out.println(str);

        // Remove first 2 character from the string and then print it.
        System.out.println(str.substring(2));

        // Change the string from Hello to Cello and then print
        System.out.println("C" + str.substring(1));

        // Convert the string to UPPERCASE & lowercase
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // Compare two strings
        System.out.println(str.compareTo(str2));

        // Find the length of String
        System.out.println(str.length());

        // Concatenate two Strings
        String firstName = "Anunay";
        String lastName = "Singh";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));

    }
}
