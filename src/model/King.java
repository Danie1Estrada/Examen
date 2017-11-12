package model;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class King extends Personaje {

    @Override
    public void fight() {
        String character = "El Rey ";
        JOptionPane.showMessageDialog(null, character + wb.useWeapon());
    }
    
}