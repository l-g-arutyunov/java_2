package ru.geekbrains.lesson2;

public class MyArrayDataException extends RuntimeException{
    public MyArrayDataException(int indexOfRow, int indexOfColumn) {
        super("Ошибка данных массива в ячейке  в строке " + indexOfRow + " в колонке " + indexOfColumn);
    }
}
