public class Strings {
    public static void main(String[] args) {
        // Q. Print all substrings of given String.
      String str = "abcd";

      for (int i=0; i<=3; i++){
          for (int j=i+1; j<=4; j++){
              System.out.print(str.substring(i,j)+" " );
          }
          System.out.println();
      }


    }
    
}
