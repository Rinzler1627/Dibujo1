package dibujo1;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.urill.Random;

   public class Ojos extends Thread
{
    private Graphics g;
    private Dibujo1 d;
    private Random r;
    private int[] x = {255,235,275}, y = {250,290,290};
    
    
    
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
            g.fillOval(170,200,70,70);
            g.fillOval(270,200,70,70);
            g.fillPolygon(x,y,3);   
            g.dravLine(255, 350, 255, 415); 
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
