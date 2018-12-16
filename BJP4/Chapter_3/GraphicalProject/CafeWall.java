import java.awt.*; // Test to see if it works------

public class CafeWall {

   public static void main(String[] args) {
   
      DrawingPanel canvas = new DrawingPanel (650, 400);
      canvas.setBackground(Color.GRAY);
      Graphics g = canvas.getGraphics();
      
      drawRow(g, 0, 0, 4, 20);
      drawRow(g, 50, 70, 5, 30);
   }
   
   
   public static void drawPair(Graphics g, int x, int y, int count, int boxSize) {
   // draws a single black and white box pair
   
      int xPosition = x + boxSize * count * 2;
   
      g.setColor(Color.BLACK);
      g.fillRect(xPosition, y, boxSize, boxSize); // draws black square
      g.setColor(Color.WHITE);
      
      g.drawLine(xPosition, y, xPosition + boxSize, y + boxSize); // line-from-upper-left
      g.drawLine(xPosition, y + boxSize, xPosition + boxSize, y); // line-from-bottom-left
      
      g.fillRect(xPosition + boxSize, y, boxSize, boxSize); // draws white square

   } // drawPair()
   
   
   public static void drawRow(Graphics g, int x, int y, int boxPairs, int boxSize) {
   // draws a row of black and white box pairs according to inputed parameters
   
      for (int i = 0; i < boxPairs; i++) {
         drawPair(g, x, y, i, boxSize);
      }
      
   } // drawRow()
   
   
} // end-of-program