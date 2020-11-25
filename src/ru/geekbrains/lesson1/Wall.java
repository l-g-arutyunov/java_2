package ru.geekbrains.lesson1;

public class Wall  implements Obstacles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getValue() {
        return height;
    }
}
