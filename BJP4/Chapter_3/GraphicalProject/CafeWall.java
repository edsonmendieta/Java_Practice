import java.awt.*;

public class CafeWall { // Uses Graphics object to draw the cafe wall illusiion.

   public static final int MORTAR = 2; // pixels of seperation between rows

   public static void main(String[] args) {
   
      DrawingPanel canvas = new DrawingPanel (650, 400);
      canvas.setBackground(Color.GRAY);
      Graphics g = canvas.getGraphics();
      
      drawRow(g, 0, 0, 4, 20);
      drawRow(g, 50, 70, 5, 30);
      
      drawGrid(g, 400, 20, 2, 2, 35, 35);
      drawGrid(g, 10, 150, 4, 4, 25, 0);
      drawGrid(g, 250, 200, 3, 3, 25, 10);
      drawGrid(g, 425, 180, 5, 5, 20, 10);
   }
   
   
   public static void drawPair(Graphics g, int x, int y, int count, int boxSize) {
   // draws a single black and white box pair
   
      int xPosition = x + boxSize * count * 2;
   
      g.setColor(Color.BLACK);
      g.fillRect(xPosition, y, boxSize, boxSize); // draws black square
      g.setColor(Color.BLUE);
      
      g.drawLine(xPosition, y, xPosition + boxSize, y + boxSize); // line-from-upper-left
      g.drawLine(xPosition, y + boxSize, xPosition + boxSize, y); // line-from-bottom-left
      
      g.setColor(Color.WHITE);
      g.fillRect(xPosition + boxSize, y, boxSize, boxSize); // draws white square

   } // drawPair()
   
   
   public static void drawRow(Graphics g, int x, int y, int boxPairs, int boxSize) {
   // draws a row of black and white box pairs according to inputed parameters
   
      for (int i = 0; i < boxPairs; i++) {
         drawPair(g, x, y, i, boxSize);
      }
      
   } // drawRow()
   
   
   public static void drawGrid(Graphics g, int x, int y, int boxPairs, int rowPairs, int boxSize, int offset) {
      
      int currentY = y; // tracks y position
      
      for (int i = 1; i <= rowPairs; i++) { // Draws a pair of rows. 2nd one is offset.
         drawRow(g, x, currentY, boxPairs, boxSize);
         currentY += boxSize + MORTAR; // moves pen down 
         drawRow(g, x + offset, currentY, boxPairs, boxSize); // offset row
         currentY += boxSize + MORTAR; // moves pen down
      }
   
   } // drawGrid()
   
   
} // end-of-program