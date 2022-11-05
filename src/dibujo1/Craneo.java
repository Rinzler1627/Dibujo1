package dibujo1;

import java.awt.Graphics;
import java.awt.Random; 

public class Craneo extends Thread
{
    private Graphics g;
    private Dibujo1 d;
    private Random r;
    
    public Craneo(Graphics g,Dibujo1 d)
    {
        this.d = d;
        this.g = g;
        this.r = new Random();
       
    } 
    
    @Override
    public void run()
    {
        while(true)
        {
            g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
            g.fillOval(130, 130, 250,230);
            g.fillRect(210,350,90,65);
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
