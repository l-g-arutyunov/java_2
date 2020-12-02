package ru.geekbrains.lesson2;

public class Test {
    public static void main(String[] args) {
        String[][] array = {{"1", "2", "3", "4"}, {"I", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"} };
        try {
            System.out.println(CheckerArray.checkArray(array));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println(e.getMessage());
        }

    }
}
