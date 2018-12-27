public class LastDigit {

   public static void main(String[] args) {
      System.out.println(lastOne(3572));
      System.out.println(lastOne(-947));
      System.out.println(lastOne(6));
      System.out.println(lastOne(35));
      System.out.println(lastOne(123456));
   }
   
   // method that takes an integer and returns the last digit
   public static int lastOne(int num) {
      return Math.abs(num) % 10;
   }

}