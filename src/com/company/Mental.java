package com.company;

public class Mental extends Player {
    private int kineticHit;
    public Mental(int health, int hit) {
        super.setHealth(health);
        super.setHit(hit);
    }

    public void printInfo() {
        System.out.println(super.getHealth() + ";" + super.getHit() + ";" + getKineticHit());
    }

    public int getKineticHit() {
        return kineticHit;
    }

    public void setKineticHit(int kineticHit) {
        this.kineticHit = kineticHit;
    }

    public void psyhicalHit() {
        super.setHit(45);
    }

    @Override
    public void makeSpeech() {
        System.out.println("Ааааааа мой мозг");
    }
}
