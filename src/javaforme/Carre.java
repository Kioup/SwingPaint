
package javaforme;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Rectangle2D;

public class Carre implements Forme {
    
    private int x;
    private int y;
    private int cote;
    
    public Carre(int x, int y, int cote){
        this.x = x;
        this.y = y;
        this.cote = cote;
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
        g.fillRect(x, y, cote, cote);
    }
    
}
