public class AsciiArt {
   
   public static void main(String[] args) {
      upperLid();
   }
   
   
   public static void tip() {
      for (int i = 1; i <= 4; i++) {
         System.out.println("| |");
      }
   }//end-of-tip()
   
   public static void upperLid() {
      for (int i = 1; i <= 4; i++) {
         for (int j = 1; j <= 6 * (4 - i); j++) {
            System.out.print(" ");
         }//Left-side-spaces 
         System.out.print("_____");
         System.out.print("/ ");
         for (int k = 1; k <= 3 * (i - 1); k++) {
            System.out.print(": ");
         }//Left-side-colons
         System.out.print("| | ");
         for (int k = 1; k <= 3 * (i - 1); k++) {
            System.out.print(": ");
         }//Right-side-colons
         System.out.print("\\");
         System.out.print("_____");
          for (int j = 1; j <= 6 * (4 - i); j++) {
            System.out.print(" ");
         }//Right-side-spaces
         System.out.println();
      }//outer-most-line-loop
   }//end-of-uppperLid()
   
}//END-of-CLASS