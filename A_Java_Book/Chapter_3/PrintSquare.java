public class PrintSquare {

   public static void main(String[] args) {
      
   }
   
   public static void printSquare1(int min, int max) {
      int difference = max - min;
      int totalLines = max - min + 1;
      
      for (int k = totalLines; k > 0; k--) {
         for (int j = 0; j < k; j++) {
            System.out.print((k * -1 + 6) + j);
         } // inner-loop
      } // outer-loop
           
   } // printSquare1()
   
} // end-of-class