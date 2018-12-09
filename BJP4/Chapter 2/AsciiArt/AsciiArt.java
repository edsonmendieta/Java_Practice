public class AsciiArt {

   public static final int SIZE = 3;
   
   public static void main(String[] args) {
      tip();
      totalTop();
      lidBottom();
      tip();
      midSection();
      totalTop();
   }
   
   
   public static void tip() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= 6 * (SIZE - 1) + 6; j++) {
            System.out.print(" ");
         }//Left-side-spaces
         System.out.print(" | | ");
         System.out.println();
      }//outermost-line-loop
   }//end-of-tip()
   
   public static void lidTop() {
      for (int i = 1; i <= SIZE; i++) {
         for (int j = 1; j <= 6 * (SIZE - i); j++) {
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
         System.out.println();
      }//outer-most-line-loop
   }//end-of-lidTop()
   
   public static void lidQuotes() {
      System.out.print(" | ");
      for (int i = 1; i <= 3 * (SIZE - 1) * 2 + 6; i++) {
         System.out.print("\" ");
      }
      System.out.print("| ");
      System.out.println();
   }//end-of-lidQuotes()
   
   public static void lidBottom() {
      for (int i = 1; i <= SIZE; i++) {
         for (int k = 1; k <= (i - 1) * 4; k++) {
            System.out.print(" ");
         }//initial-spaces
         System.out.print(" \\___/ ");
         for (int j = 1; j <= i * -2 + SIZE * 3; j++) {
            System.out.print("\\ / ");
         }//inner-slash-pairs
         System.out.print("\\___/");
         System.out.println();
      }//outer-most-loop
   }//end-of-lidBottom()
   
   public static void midSection() {
      for (int i = 1; i <= SIZE * SIZE; i++) {
         for (int j = 1; j <= 6 * (SIZE - 1) + 6 - (SIZE - 2); j++) {
            System.out.print(" ");
         }//Left-side-spaces
         System.out.print("|");
         for (int k = 1; k <= (SIZE * 2 - 4) / 2; k++) {
            System.out.print("%");
         }//Left-side-%
         System.out.print("| |");
         for (int k = 1; k <= (SIZE * 2 - 4) / 2; k++) {
            System.out.print("%");
         }//Right-side-%
         System.out.print("|");
         System.out.println();
      }//outermost-loop
   }//end-of-midSection();
   
   
   
   public static void totalTop() {
      lidTop();
      lidQuotes();
   }
   
}//END-of-CLASS