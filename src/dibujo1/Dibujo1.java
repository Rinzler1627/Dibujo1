
package dibujo1;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JFrame;

public class Dibujo1 extends JFrame

{
    int[] x = {255,235,275}, y = {250,290,290};
    static String texto = "Dia de muertos xd";
    
    public Dibujo1 {}
    {
        setLocation(150,150);
        setSize(500,500);
        setVisible(true);
        getContentPane().setBackground(color.Black); 
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        
        g.setColor(Color.WHITE);
        g.fillOval(130, 130, 250,230);
        g.fillRect(210,350,90,65);
        
        g.setColor(Color.BLACK);
        g.fillOval(170,200,70,70);
        g.fillOval(270,200,70,70);
        g.fillPolygon(x,y,3);   
        g.dravLine(255, 350, 255, 415); 
        
        Font f = new Font("Arial",Font.BOLD,20);
        g.setFont(f);
        g.setColor(Color.YELLOW);
        g.drawString(texto,(this.getWidth()/2)-70,440);     
    }
            
    public static void main(String arg[])
    {
        Dibujo1 d = new Dibujo1 ();
        Craneo c = new Craneo(d.getGraphics(), d);
        Ojos c = new Ojos(d.getGraphics(), d);
        Letrero l = new Letrero(d.getGraphics(),d, texto);
        
        c.start();
        o.start();
        l.start();
        
        d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
            
    
}
