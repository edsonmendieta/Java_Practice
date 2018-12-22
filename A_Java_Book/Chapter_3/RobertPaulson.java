public class RobertPaulson { // Asks user for phrase and number of times to print it, then prints it.

   public static void main(String[] args) 
      Scanner console = new Scanner(System.in);
      System.out.print("What is your phrase? ");
      String phrase = console.nextLine();
      System.out.print("How many times should I repeat it? ");
      int timesRepeated = console.nextInt();

      for (int i = 1; i <= timesRepeated; i++) { // prints user phrase number of times requested
         System.out.println(phrase);
      }
   

   }
}