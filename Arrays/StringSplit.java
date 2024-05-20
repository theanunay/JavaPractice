public class StringSplit {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        String str = "Hello";
        StringBuilder sb2 = new StringBuilder("Hello");
        String str2 = "Hello";

        System.out.println(str.equals(str2));
        System.out.println(str == str2 );
    }
}
