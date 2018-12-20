public class Min { // returns smallest of three numbers

   public static void main(String[] args) {
      min(-14, 847, 3);
   }
   
   
   public static int min(int one, int two, int three) {
      return Math.min(one, Math.min(two, three));
   }
   

}