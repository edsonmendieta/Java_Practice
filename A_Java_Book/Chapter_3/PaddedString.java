public class PaddedString {

   public static void main(String[] args) {
      System.out.print(padString("book", 10));
   }
   
   public static String padString(String words, int length) {
   // returns original string if it's length is equal to or greater than length parameter
   // else, returns a string with leading whitespace to equal length parameter
      if (words.length() >= length) {
         return words;
      } else {
         String padded = "";
         for (int i = 1; i <= length - words.length(); i++) {
            padded += " ";
         }
         padded += words;
         return padded;
      }
   } // padString()

}