import java.awt.*;

public class CafeWall {

   public static void main(String[] args) {
   
      DrawingPanel canvas = new DrawingPanel (650, 400);
      canvas.setBackground(Color.GRAY);
      Graphics g = canvas.getGraphics();
      
      drawRow(g, 0, 0, 1, 20);
   }
   
   
   public static void drawRow(Graphics g, int x, int y, int boxPairs, int boxSize) {
   
      g.setColor(Color.BLACK);
      g.fillRect(x, y, boxSize, boxSize);
      g.setColor(Color.WHITE);
      g.drawLine(x, y, x + boxSize, y + boxSize);
      g.drawLine(x, y + boxSize, x + boxSize, y);
   
   }
   
}// end-of-program