public class UserProduct {
// asks user for a total, and then asks for a number 'total' times, then returns cumulative product

   public static void main(String[] arg) {
      Scanner console = new Scanner(System.in);

      System.out.print("How many numbers? ");
      int totalNums = console.nextInt();

      int product = 1;

      for (int i = 1; i <= totalNums; i++) {
         System.out.print("Next number --> ");
         int userNum = console.nextInt();
         product *= userNum;
      }

      System.out.print("Product = " + product);
  }

}