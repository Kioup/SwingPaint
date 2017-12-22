
package javaforme;

import java.awt.Color;
import java.awt.Graphics;

public class Cercle implements Forme {
    
    private int x;
    private int y;
    private int rayon;
    
    public Cercle(int x, int y, int rayon){
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    @Override
    public void deplace(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dessine(Graphics g) {
        int R = (int) (Math.random( )*256);
        int G = (int)(Math.random( )*256);
        int B= (int)(Math.random( )*256);
        Color randomColor = new Color(R, G, B);
        g.setColor(randomColor);
        x = this.x-(this.rayon/2);
        y = this.y-(this.rayon/2);
        g.fillOval(x,y,this.rayon,this.rayon);
    }
  
}
