package controller;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import view.View;
import model.*;

public class Controller implements ActionListener {

    private final String [] characterList;
    private final String [] weaponList;
    private WeaponBehavior wb;
    private Personaje p;
    private View v;

    public Controller() {
        weaponList   =  new String [] { "Seleccione...",
                                        "Espada",
                                        "Daga",
                                        "Hacha",
                                        "Arco y Flecha"};

        characterList = new String [] { "Seleccione...",
                                        "Rey",
                                        "Reina",
                                        "Caballero",
                                        "Orco"};
        v = new View();
        v.build();
        v.options.addActionListener(this);
        v.accept.addActionListener(this);
        v.cancel.addActionListener(this);
    }

    public void start() {
        JOptionPane.showMessageDialog(null, null, "Bienvenido", -1,
        new ImageIcon("src/view/img/Wow.jpg"));
        check();
    }

    public void check() {
        if (p  == null) {
            JOptionPane.showMessageDialog(null, "Seleccione su personaje");
            v.view.setTitle("Seleccion de personaje");
            v.updateOptions(characterList);
            } else {
                if (wb == null) {
                    JOptionPane.showMessageDialog(null, "Seleccione su arma");
                    v.view.setTitle("Seleccion de arma");
                    v.updateOptions(weaponList);
                    selectWeapon();
                } else {
                    v.view.setVisible(false);
                    play();
                }
            }
    }
    
    public void select() {
        if (p == null) {
            selectCharacter();
            check();
        } else {
            selectWeapon();
            check();
        }
    }

    public void selectCharacter() {
        String character = v.getSelection();

        switch (character) {
            case "Rey":
                p = new King(); break;
            case "Reina":
                p = new Queen(); break;
            case "Caballero":
                p = new Knight(); break;
            case "Orco":
                p = new Orc(); break;
        }
    }

    public void selectWeapon() {
        String weapon = v.getSelection();

        switch (weapon) {
            case "Espada":
                wb = new SwordBehavior(); break;
            case "Daga":
                wb = new KnifeBehavior(); break;
            case "Hacha":
                wb = new AxeBehavior(); break;
            case "Arco y Flecha":
                wb = new BowAndArrowBehavior(); break;
        }

        p.setWeapon(wb);
    }

    public void play() {
        p.fight();
        gameOver();
    }

    public void gameOver() {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.options) {
            v.updateImage();
        } else if(e.getSource() == v.cancel) {
            gameOver();
        } else if (e.getSource() == v.accept) {
            select();
        }
    }

}