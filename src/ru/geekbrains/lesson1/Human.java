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
    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public String getInfo() {
        return "Человек (длина: " + maxLength + ", высота: " + maxHeight + ")";
    }
}
