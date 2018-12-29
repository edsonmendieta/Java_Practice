public class StringReverse {

   public static void main(String[] args) {
   
   }
   
   public static void printReverse(String words) {
   // prints a reversed version of the parameter string
      for (int i = words.length() - 1; i >= 0; i--) {
         System.out.print(words.charAt(i));
      }
   }

}