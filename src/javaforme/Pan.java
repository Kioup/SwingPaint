
package javaforme;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Pan extends JPanel{

    Dessin tab ;
    
    public Pan(Dessin formes) {
        this.tab = formes;
    }
    
    @Override
    public void paintComponent(Graphics g){
        this.tab.dessine(g);
    };
    
}
