package com.company;

public class Warrior extends Player {
    private int physicalHit;

    public Warrior(int health, int hit) {
        super.setHealth(health);
        super.setHit(hit);
    }

    public void printInfo() {
        System.out.println(super.getHealth() + ";" + super.getHit() + ";крит.урон дает + " + getPhysicalHit()+" урона");
    }

    public int getPhysicalHit() {
        return physicalHit;
    }

    public void setPhysicalHit(int physicalHit) {
        this.physicalHit = physicalHit;
    }

    public void psyhicalHit() {
        super.setHit(super.getHit()+physicalHit);
    }

    @Override
    public void makeSpeech() {
        System.out.println("Да поможет силушка богатырьская");
    }

}
