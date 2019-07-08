package com.company;

public class Warrior extends Player {
    private int physicalHit;

    public Warrior(int health, int hit) {
        super.setHealth(health);
        super.setHit(hit);
    }

    public void printInfo() {
        System.out.println(super.getHealth() + ";" + super.getHit() + ";" + getPhysicalHit());
    }

    public int getPhysicalHit() {
        return physicalHit;
    }

    public void setPhysicalHit(int physicalHit) {
        this.physicalHit = physicalHit;
    }

    public void psyhicalHit() {
        super.setHit(50);
    }

    @Override
    public void makeSpeech() {
        System.out.println("Да поможет силушка богатырьская");
    }

}
