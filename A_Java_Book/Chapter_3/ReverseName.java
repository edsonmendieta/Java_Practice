import java.util.*;

public class ReverseName {

   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      processName(console);
   }
   
   public static void processName(Scanner console) {
      System.out.print("Please enter your full name: ");
      String name = console.nextLine();
      
      //System.out.print(name + " " + name.length());
      
      int space = name.indexOf(" ");
      
      String first = name.substring(0, space);
      
      String last = name.substring(space + 1);
      
      
      System.out.print("Your name in reverse order is " + last + ", " + first);
   } // processName()

}