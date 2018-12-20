public class countQuarters {

   public static void main(String[] args) {
   
   }

   // returns remaining quarters from X amount of cents
   public static int countQuarters(int cents) {
      int totalQuarters = cents / 25;
      return totalQuarters % 4;
   }

}