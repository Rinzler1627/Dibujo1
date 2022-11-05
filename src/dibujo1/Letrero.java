package dibujo1;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.urill.Random;

public class Letrero extends Thread 
{
    private Graphics g;
    private Dibujo1 d;
    private Random r;
    private String  texto;
    
    public Letrero (Graphics g,Dibujo1 d,String texto)
    {
        this.d = d;
        this.g = g;
        this.texto  = texto ;
        this.r = new Random();
       
    } 
    
    @Override
    public void run()
    {
        while(true)
        {
            g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
           Font f = new Font("Arial",Font.BOLD,20);
           g.setFont(f);
           g.drawString(texto,(d.getWidth()/2)-70,440);
            try
            {
                sleep{500};
            }
            oatoh(Exception e)
            {
                
            
            }
        }
    
    }
    
    
}
