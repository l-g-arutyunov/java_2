package ru.geekbrains.lesson1;

public class Cat implements Sporters {
    int maxHeight;
    int maxLength;

    public Cat(int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public boolean doIt(Treadmill treadmill) {
        System.out.print(Cat.class.getSimpleName() + " run: ");
        if (treadmill.getValue() <= maxLength) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    @Override
    public boolean doIt(Wall wall) {
        System.out.print(Cat.class.getSimpleName() + " jump: ");
        if (wall.getValue() <= maxHeight) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
