package ru.geekbrains.lesson1;

import java.util.HashMap;

public class Human implements Sporters {
    int maxHeight;
    int maxLength;

    public Human(int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public boolean doIt(Treadmill treadmill) {
        System.out.print(Human.class.getSimpleName() + " run: ");
        if (treadmill.getValue() <= maxLength) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    @Override
    public boolean doIt(Wall wall) {
        System.out.print(Human.class.getSimpleName() + " jump: ");
        if (wall.getValue() <= maxHeight) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
