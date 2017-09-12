package com.company;

public class Main {

    public static void main(String[] args) {
	GamePiece gP = new GamePiece("Sav", "Pink");
	gP.printInfo();
	gP.move(8888, 9);
	gP.printInfo();

	//	gP.unFreeze();
        gP.move(45, 7);
        System.out.println(gP.getPositionX() + " " + gP.getPositionY());
        gP.move(3, 11);
        System.out.println(gP.getPositionX() + " " + gP.getPositionY());
    //  gP.frozen();
        gP.move(4, 7);
        System.out.println(gP.getPositionX() + " " + gP.getPositionY());
    }
}
