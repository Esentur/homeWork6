package com.company;

public class Main {

    public static void main(String[] args) {
        Boss shaokhan = new Boss(500, 50);
        shaokhan.makeSpeech();
        shaokhan.changeBossDefence();
        shaokhan.printInfo();

        Warrior dobrynya = new Warrior(250, 20);
        Magic merlin = new Magic(240, 20);
        Mental professorX = new Mental(230, 20);
        
        int num = shaokhan.getDefence();
        switch (num) {
            case 1:
                dobrynya.setPhysicalHit(10);
                break;
            case 2:
                merlin.setMagicalHit(20);
                break;
            case 3:
                professorX.setKineticHit(40);
                break;
            default:
                break;

        }

        dobrynya.makeSpeech();
        dobrynya.psyhicalHit();
        dobrynya.printInfo();


        merlin.makeSpeech();
        merlin.getMagicalHit();
        merlin.printInfo();


        professorX.makeSpeech();
        professorX.getKineticHit();
        professorX.printInfo();

    }
}
