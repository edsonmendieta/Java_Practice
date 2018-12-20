public class Temperature { // converts farenheight to celsius
    public static void main(String[] args) {
        double tempf = 98.6;
        double tempc = ftoc(tempf);
        System.out.println("Body temp in C is: " + tempc);
    }

    // converts Fahrenheit temperatures to Celsius
    public static double ftoc(double tempf) {
        return (tempf - 32) * 5 / 9;
    }
}