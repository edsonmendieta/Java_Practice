public class VerticalString {

   public static main(String[] args) {
      vertical("hey now");
      vertical("BOOYAH");
      vertical("");
   }
   
   public static void vertical(String words) {
      for (int i = 0; i < words.length(); i++) {
         System.out.println(words.charAt(i));  
      }
   } // void()

}