public class MickeyBox { // draws a box with Mickey ears

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(220, 150);
        panel.setBackground(Color.YELLOW);
        Graphics g = panel.getGraphics();
        
        g.setColor(Color.BLUE);
        
        g.fillOval(50, 25, 40, 40);
        g.fillOval(130, 25, 40, 40);
        
        g.setColor(Color.RED);
        g.fillRect(70, 45, 80, 80);
        
        g.setColor(Color.BLACK);
        g.drawLine(70, 85, 150, 85);
        
    }
    
    

}