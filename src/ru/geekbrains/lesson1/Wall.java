package ru.geekbrains.lesson1;

public class Wall  implements Obstacles{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean doIt(Sporters sporter) {
        return (sporter.getMaxHeight() >= height);
    }

    @Override
    public String getInfo() {
        return "прыгнул " + height;
    }
}
