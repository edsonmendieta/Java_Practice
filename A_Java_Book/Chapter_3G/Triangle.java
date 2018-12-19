public class Triangle { // draws and upturned pyramid in a window panel
    public static void main(String[] args) {
        
        drawPyramid(600, 200, 10);
        
    }
    
    
    public static void drawPyramid(int width, int height, int lineSpace) {
        // creates window and upside-down pyramid according to parameters
        
        DrawingPanel panel = new DrawingPanel(width, height); // creates window
        panel.setBackground(Color.YELLOW); // window background
        Graphics g = panel.getGraphics(); 
        g.setColor(Color.BLUE); // sets color
        
        int edgeSpace = 0; //keeps track of increasing space b/w edge and start/end of line
        
        for (int i = 0; i < height; i += lineSpace) { // draws lines
            g.drawLine(15 + edgeSpace, lineSpace + i, width - (edgeSpace + 15), lineSpace + i);
            edgeSpace += 15;
        }
        
        g.drawLine(0, 0, width / 2, height); // left-side diagonal
        g.drawLine(width, 0, width / 2, height); // right-side diagonal
        
    } // drawPyramid()
    
    
} // end-of-class