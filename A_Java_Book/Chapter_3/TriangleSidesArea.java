public class TriangleSidesArea {
   
   public static void main(String[] args) {
   
   }
   
   public static double triangleArea(double side1, double side2, double side3) {
      double s = (side1 + side2 + side3) / 2.0;
      return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
   }
   
}  