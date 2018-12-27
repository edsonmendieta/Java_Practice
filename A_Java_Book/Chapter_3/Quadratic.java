public class Quadratic {
// method that takes the 3 coefficients in quadratic equation and outputs two roots (+ or -).

   public static void main(String[] args) {
   
   quadraticMethod(1, -7, 12);
   quadraticMethod(1, 3, 2);
      
   }
   
   
   public static void quadraticMethod(int a, int b, int c) {

      
      double positiveRoot = ((-1 * b) + Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
      double negativeRoot = ((-1 * b) - Math.sqrt((Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
      
      System.out.println("First root = " + positiveRoot);
      System.out.println("Second root = " + negativeRoot);
   
   } // quadraticMethod()

}