package model;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Orc extends Personaje {
    
    @Override
    public void fight() {
        String character = "El Orco ";
        JOptionPane.showMessageDialog(null, character + wb.useWeapon());
    }
    
}
