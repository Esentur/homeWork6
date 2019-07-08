package com.company;

public class Magic extends Player {
    private int magicalHit;

    public Magic(int health, int hit) {
        super.setHealth(health);
        super.setHit(hit);
    }

    public void printInfo() {
        System.out.println(super.getHealth() + ";" + super.getHit() + ";крит.урон дает + " + getMagicalHit()+" урона");
    }

    public int getMagicalHit() {
        return magicalHit;
    }

    public void setMagicalHit(int magicalHit) {
        this.magicalHit = magicalHit;
    }

    public void magicalHit() {
        super.setHit(super.getHit()+magicalHit);
    }

    @Override
    public void makeSpeech() {
        System.out.println("Абракадабраааааааа");
    }
}
