public class Football { // draws diagonal lines inside of square, creating football whitespace
    
    public static void main(String[] args) {
        
        DrawingPanel panel = new DrawingPanel(250, 250); // create window and set color
        panel.setBackground(Color.WHITE);
        Graphics g = panel.getGraphics();
        g.setColor(Color.BLACK);
        
        g.drawRect(10, 30, 200, 200); // outer rectangle
        
        for (int i = 1; i <= 20; i++) { // left-side lines
            g.drawLine(10, 230 - 10 * i, 10 + i * 10, 30);
        }
        
        for (int i = 1; i <= 20; i++) { // right-side lines
            g.drawLine(10 + i * 10, 230, 210, 230 - i * 10);
        }
    }
    
    
    
} // end-of-class