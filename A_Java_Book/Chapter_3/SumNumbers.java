public class SumNumbers { // uses a high & low integers inputed by user to return sum of all #'s
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("low? ");
        int low = console.nextInt(); // save low value
        System.out.print("high? ");
        int high = console.nextInt(); // save high value
        int sum = 0;
        for (int i = low; i <= high; i++) { // sum all integers between, and including, low & high
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}