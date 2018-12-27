public class CylinderSA {

   public static void main(String[] args) {
   
   }
   
   public static double cylinderSurfaceArea(double radius, double height) {
   // accepts radius and height values & returns a cylinder's surface area
      return 2 * Math.PI * Math.pow(radius, 2) + 2 * Math.PI * radius * height;
   }

}