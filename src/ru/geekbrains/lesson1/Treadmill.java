package ru.geekbrains.lesson1;

public class Treadmill implements Obstacles{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getValue() {
        return length;
    }
}
