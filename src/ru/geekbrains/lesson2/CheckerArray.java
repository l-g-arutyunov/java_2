package ru.geekbrains.lesson2;

public class CheckerArray {
    public static final int STANDARD_LENGTH = 4;

    public static int checkArray(String[][] stringArray) throws MyArraySizeException, MyArrayDataException{
        if (stringArray.length != STANDARD_LENGTH) {
            throw new MyArraySizeException();
        }

        for (String[] strings : stringArray) {
            if (strings.length != STANDARD_LENGTH) {
                throw new MyArraySizeException();
            }
        }

        int sumValueOfArray = 0;

        for (int row = 0; row < stringArray.length; row++) {
            for (int column = 0; column < stringArray[row].length; column++) {
                try {
                    sumValueOfArray += Integer.parseInt(stringArray[row][column]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(row, column);
                }
            }
        }

        return sumValueOfArray;
    }
}
