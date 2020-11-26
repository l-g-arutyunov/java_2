package ru.geekbrains.lesson1;

public class Robot implements Sporters {
    int maxHeight;
    int maxLength;

    public Robot(int maxHeight, int maxLength) {
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
        return "Робот (длина: " + maxLength + ", высота: " + maxHeight + ")";
    }
}
