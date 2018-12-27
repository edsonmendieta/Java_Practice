public class LargerAbsVal { // Program takes two user inputed integers and
// returns largest absolute value.

   public static void main(String[] args) {
      int test1 = largerAbsolute(11, 2);
      System.out.print(test1);
      
      System.out.println();
      
      int test2 = largerAbsolute(4, -5);
      System.out.print(test2);
   }
   
   
   public static int largerAbsolute(int num1, int num2) {
     
      return Math.max(Math.abs(num1), Math.abs(num2)); // returns largest absolute
   }

}