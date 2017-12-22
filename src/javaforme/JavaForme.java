
package javaforme;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.io.IOException;
import javax.swing.*;

public class JavaForme {

    public static void main(String[] args) {
        
        
        JButton forme = new JButton("|_|");
        JButton push = new JButton("APLLY");
        JPanel coordx = new JPanel();
        JPanel coordy = new JPanel();
        
        JTextField x = new JTextField();
        x.setColumns(5);
        JLabel abscisse = new JLabel("x :");
        coordx.add(abscisse);
        coordx.add(x);
        
        JTextField y = new JTextField();
        y.setColumns(5);
        JLabel ordonnees = new JLabel("y :");
        coordy.add(ordonnees);
        coordy.add(y);
       
        Toolbar outils = new Toolbar(forme, coordx, coordy, push);
        
        Cercle cercle = new Cercle(100,50,50);
        Dessin tab = new Dessin();
        System.out.println(tab);
        push.addActionListener(new Coords(x, y));
        tab.add(cercle);
        //tab.add(carre);
        
        JFrame window = new JFrame("Formes");
        Pan panneau = new Pan(tab);
        outils.setPreferredSize(new Dimension(640, 40));
        panneau.add(outils, BorderLayout.NORTH);        

        panneau.setSize(640, 400); 
        window.setContentPane(panneau);
        window.setSize(640, 480);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
    }
    
}
