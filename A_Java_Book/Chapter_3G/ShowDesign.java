// Instructions: Write a complete program in a class named ShowDesign that uses the DrawingPanel to draw the following figure: The window is 200 pixels wide and 200 pixels tall. The background is white and the foreground is black. There are 20 pixels between each of the four rectangles, and the rectangles are concentric (their centers are at the same point). Use a loop to draw the repeated rectangles.

public class ShowDesign { // draws equally spaced concentric rectangles using a loop

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(200, 200);
        panel.setBackground(Color.WHITE);
        Graphics g = panel.getGraphics();
        
        g.setColor(Color.BLACK);
        
        for (int i = 20; i <= 80; i += 20) {
            g.drawRect(i, i, 200 - (i * 2), 200 - (i * 2));
        } 
    }
    

} // end-of-class