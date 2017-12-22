
package javaforme;
import javax.swing.*;

public class Toolbar extends JToolBar{
    
    public Toolbar(JButton forme, JPanel x, JPanel y, JButton apply){
        this.add(forme);
        this.add(x);
        this.add(y);
        this.add(apply);
    }
    
}
