import java.awt.*; // Test to see if it works------

public class CafeWall {

   public static void main(String[] args) {
   
      DrawingPanel canvas = new DrawingPanel (650, 400);
      canvas.setBackground(Color.GRAY);
      Graphics g = canvas.getGraphics();
      
      drawRow(g, 0, 0, 4, 20);
   }
   
   
   public static void drawPair(Graphics g, int x, int y, int count, int boxSize) {
   
   
      g.setColor(Color.BLACK);
      g.fillRect(x + boxSize * count * 2, y, boxSize, boxSize);// draws black square
      g.setColor(Color.WHITE);
      
      g.drawLine(x + boxSize * count * 2, y, x + boxSize * count * 2 + boxSize, y + boxSize); // line-from-upper-left
      g.drawLine(x + boxSize * count * 2, y + boxSize, x + boxSize * count * 2 + boxSize, y); // line-from-bottom-left
      
      g.fillRect(x + boxSize * count * 2 + boxSize, y, boxSize, boxSize); // draws white square

   }// drawPair()
   
   
   public static void drawRow(Graphics g, int x, int y, int boxPairs, int boxSize) {
   
      for (int i = 0; i < boxPairs; i++) {
         drawPair(g, x, y, i, boxSize);
      }
      
   }// drawRow()
   
   
}// end-of-program