public class PrintSquare {

   public static void main(String[] args) {
      printSquare1(1, 5);
      printSquare1(3, 9);
      printSquare1(0, 3);
      printSquare1(5, 5);
      printSquare1(0, 10);
   }
   
   public static void printSquare1(int min, int max) {
      int difference = max - min;
      int totalLines = max - min + 1;
      
      for (int k = totalLines; k > 0; k--) { // Tracks current line
         for (int j = 0; j < k; j++) { // prints leading #'s
            System.out.print((min + (k * -1 + totalLines)) + j);
         } // inner-loop
         for (int g = 0; g < totalLines - k; g++) { // prints rotated #'s
            System.out.print(min + g);
         } // inner-loop
         System.out.println();
      } // outer-loop
           
   } // printSquare1()
   
} // end-of-class