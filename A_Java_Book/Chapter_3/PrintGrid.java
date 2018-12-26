public class PrintGrid { // prints grid of numbers from 1 to N depending rows & columns inputed

   public static void main(String[] args) {
      printGrid1(3, 6);
      printGrid1(5, 3);
      printGrid1(4, 1);
      printGrid1(1, 3);
   }
   
   
   public static void printGrid1(int rows, int cols) {
      
      for (int i = 1; i <= rows; i++) { // begins a row
      
         int currentLineInt = i;
         
         for (int j = 1; j <= cols; j++) { // prints a column
            System.out.print(currentLineInt);
            if (j < cols) {
               System.out.print(", ");
            }
            currentLineInt += rows;
         }
         
         System.out.println();
      } // outermost loop
      
      System.out.println();
      
   } // printGrid1()

} // end-of-class