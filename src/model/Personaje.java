package model;

public abstract class Personaje {

    protected WeaponBehavior wb;

    public void setWeapon(WeaponBehavior wb) { 
        this.wb = wb;
    }

    public abstract void fight();
}