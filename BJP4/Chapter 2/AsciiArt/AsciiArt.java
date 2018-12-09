public class AsciiArt {
   
   public static void main(String[] args) {
      tip();
      lidTop();
      lidQuotes();
      lidBottom();
      tip();
      midSection();
   }
   
   
   public static void tip() {
      for (int i = 1; i <= 4; i++) {
         for (int j = 1; j <= 6 * (4 - 1) + 6; j++) {
            System.out.print(" ");
         }//Left-side-spaces
         System.out.print(" | | ");
         for (int j = 1; j <= 6 * (4 - 1) + 6; j++) {
            System.out.print(" ");
         }//Right-side-spaces
         System.out.println();
      }
   }//end-of-tip()
   
   public static void lidTop() {
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
   }//end-of-lidTop()
   
   public static void lidQuotes() {
      System.out.print(" | ");
      for (int i = 1; i <= 3 * (4 - 1) * 2 + 6; i++) {
         System.out.print("\" ");
      }
      System.out.print("| ");
      System.out.println();
   }//end-of-lidQuotes()
   
   public static void lidBottom() {
      for (int i = 1; i <= 4; i++) {
         for (int k = 1; k <= (i - 1) * 4; k++) {
            System.out.print(" ");
         }//initial-spaces
         System.out.print(" \\___/ ");
         for (int j = 1; j <= i * -2 + 12; j++) {
            System.out.print("\\ / ");
         }//inner-slash-pairs
         System.out.print("\\___/");
         System.out.println();
      }//outer-most-loop
   }//end-of-lidBottom()
   
   public static void midSection() {
      for (int i = 1; i <= 4 * 4; i++) {
         for (int j = 1; j <= 6 * (4 - 1) + 4; j++) {
            System.out.print(" ");
         }//Left-side-spaces
         System.out.print("|%%| |%%|");
         System.out.println();
      }//outermost-loop
   }
   
}//END-of-CLASS