package ru.geekbrains.lesson1;

public class Cat implements Sporters {
    int maxHeight;
    int maxLength;

    public Cat(int maxHeight, int maxLength) {
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
    }

    @Override
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public String getInfo() {
        return "Кот (длина: " + maxLength + ", высота: " + maxHeight + ")";
    }
}
