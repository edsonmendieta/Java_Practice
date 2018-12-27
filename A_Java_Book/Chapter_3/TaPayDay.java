public class TaPayDay {
   
   public static void main(String[] args) {
   
   }
   
   public static double pay(double salary, int hoursWorked) {
   // computes a TA's pay in relation to their salary and hours worked in a given week.
   
      double overtimeHours = 0;
      
      if (hoursWorked > 8) {
         overtimeHours = hoursWorked - 8;
         return salary * 8 + salaray * 1.5 * overtimeHours;
      } else {
         return salary * hoursWorked;
      }
      
   }
   
}