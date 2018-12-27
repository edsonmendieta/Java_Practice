public class LargestAbsVal {
   // method that returns largest absolute value of 3 integers.
   public static main(String[] args) {
   
   }
   
   public static int largestAbsolute(int num1, int num2, int num3) {
      return Math.max(Math.max(Math.abs(num1), Math.abs(num2)), Math.abs(num3));
   }

}