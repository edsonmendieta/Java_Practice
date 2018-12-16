public class PrintStrings  // method takes string parameter and prints it out according to int parameter.
   
   public static void main(String[] args) {
      printStrings("abc", 5);
   }
   
   public static void printStrings(String any, int times) {
    for (int i = 1; i <= times; i++) {
        System.out.print(any);
    }
}
}