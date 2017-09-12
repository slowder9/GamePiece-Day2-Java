package com.company;

public class GamePiece {
    int positionX;
    int positionY;
    boolean frozen;
    String name;
    String color;
    public void printInfo () {
        System.out.println("Position X: " + positionX);
        System.out.println("Position Y: " + positionY);
        System.out.println("Frozen: " + frozen);
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }

    public GamePiece (String name, String color) {
        positionX = 0;
        positionY = 0;
        frozen = false;
        this.name = name;
        this.color = color;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void move (int x, int y) {
        if (frozen == false) {
            positionX += x;
            positionY += y;
        } else if (frozen == true) {
            positionX = x;
            positionY = y;
        }

//        positionX = x;
//        positionY = y;
    }

    public void frozen () {
        frozen = true;
    }

    public void unFreeze () {
        frozen = false;
    }
}
