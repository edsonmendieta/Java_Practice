import java.awt.*;

public class CafeWall {

   public static void main(String[] args) {
   
      DrawingPanel canvas = new DrawingPanel (650, 400);
      canvas.setBackground(Color.GRAY);
      Graphics g = canvas.getGraphics();
      
      drawRow(g, 0, 0, 1, 20);
   }
   
   
   public static void drawPair(Graphics g, int x, int y, int boxSize) {
   
      g.setColor(Color.BLACK);
      g.fillRect(x, y, boxSize, boxSize);
      g.setColor(Color.WHITE);
      g.drawLine(x, y, x + boxSize, y + boxSize);
      g.drawLine(x, y + boxSize, x + boxSize, y);
      
      g.setColor(Color.WHITE);
      g.fillRect(x + boxSize, y, boxSize, boxSize);

   }// drawPair()
   
   
   public static void drawRow(Graphics g, int x, int y, int boxPairs, int boxSize) {
   
      drawPair(g, x, y, boxSize);
      
   }// drawRow()
   
}// end-of-program