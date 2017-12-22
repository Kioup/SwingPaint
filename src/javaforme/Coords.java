
package javaforme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.JTextField;

class Coords implements ActionListener {
    
    JTextField x;
    JTextField y;
    
    public Coords(JTextField x, JTextField y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int x = parseInt(this.x.getText());
        int y = parseInt(this.y.getText());
        Carre carre = new Carre(x,y,x);
    }
}
