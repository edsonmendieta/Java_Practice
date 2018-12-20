public class TheNameGame { // uses user's first & last name in a song

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name? "); 
        String name = console.nextLine(); // save's user input string
        
        int spaceIndex = name.indexOf(" ");
        String firstName = name.substring(0, spaceIndex); // 1st word is first name
        String lastName = name.substring(spaceIndex + 1); // 2nd word is last name
        
        song(firstName);
        song(lastName);
    }
    
    public static void song(String name) {
        String allButFirst = name.substring(1); // name except 1st letter
        System.out.println(name + " " + name + ", bo-B" + allButFirst);
        System.out.println("Banana-fana fo-F" + allButFirst);
        System.out.println("Fee-fi-mo-M" + allButFirst);
        System.out.println(name.toUpperCase() + "!");
    } // song()

}