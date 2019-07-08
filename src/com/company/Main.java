package com.company;

public class Main {

    public static void main(String[] args) {
        Boss shaokhan = new Boss(500, 50);
        shaokhan.makeSpeech();
        shaokhan.changeBossDefence();
        shaokhan.printInfo();

        Warrior dobrynya = new Warrior(250, 20);
        Magic merlin = new Magic(250, 20);
        Mental professorX = new Mental(250, 20);

        int num = shaokhan.getDefence();
        switch (num) {
            case 1:
                dobrynya.setPhysicalHit(10);
                dobrynya.psyhicalHit();
                break;
            case 2:
                merlin.setMagicalHit(20);
                merlin.magicalHit();
                break;
            case 3:
                professorX.setKineticHit(40);
                professorX.kineticHit();
                break;
            default:
                break;

        }

        dobrynya.makeSpeech();
        dobrynya.printInfo();


        merlin.makeSpeech();
        merlin.printInfo();


        professorX.makeSpeech();
        professorX.printInfo();

    }
}
