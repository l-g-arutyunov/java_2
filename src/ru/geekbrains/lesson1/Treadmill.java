package ru.geekbrains.lesson1;

public class Treadmill implements Obstacles{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean doIt(Sporters sporter) {
        return (sporter.getMaxLength() >= length);
    }

    @Override
    public String getInfo() {
        return "пробежал " + length;
    }
}
