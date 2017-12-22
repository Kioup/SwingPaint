
package javaforme;

import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;

public class Dessin implements Forme {
    
    ArrayList<Forme> formes = new ArrayList();
    
    public Dessin(){
        ArrayList forme = this.formes;
    }
    
    public void add(Forme forme){
        this.formes.add(forme);
    }

    @Override
    public void deplace(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void dessine(Graphics g) {
        for(int i=0; i<this.formes.size();i++){
            Forme forme = this.formes.get(i);
            forme.dessine(g);
        }
    }
    
}
