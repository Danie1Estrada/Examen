package model;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Queen extends Personaje {

    @Override
    public void fight() {
        String character= "La Reina ";
        JOptionPane.showMessageDialog(null, character + wb.useWeapon());
    }

}