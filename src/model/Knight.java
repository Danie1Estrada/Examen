package model;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Knight extends Personaje {

    @Override
    public void fight() {
        String character = "El Caballero ";
        JOptionPane.showMessageDialog(null, character + wb.useWeapon());
    }
    
}