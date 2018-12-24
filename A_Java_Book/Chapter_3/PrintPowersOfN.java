public class PrintPowersOfN {
// takes user inputted base & exponent and prints out successive power products

   public class void main(String[] args) {
   printPowersofN1(4, 3);
   printPowersofN1(-6, 0);
   printPowersofN1(-2, 8);   
   }
   
   printPowersofN1(int base, int exponent){
      System.out.print("1 ");
      int total = 1;
      for (int i = 1; i <= exponent; i++) { // running product total * base; done 'exponent' amount of times
         total = (total * base);
         System.out.print(total + " ");
      }
   }
  
}