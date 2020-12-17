package ru.geekbrains.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static final int size = 10000000;
    static final int h = size / 2;


    public static void main(String[] args) {
        secondMethod();
        //firstMethod();
    }

    public static void firstMethod() {
        List arrays = generateArray(size);
        long a = System.currentTimeMillis();
        float[] array = changeArray((float[]) arrays.get(0));
        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    public static void secondMethod() {
        List arrays = generateArray(h);
        long a = System.currentTimeMillis();

        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < arrays.size(); i++) {
            float[] array = (float[]) arrays.get(i);
            Thread tread = new Thread(() -> changeArray(array));
            tread.start();
            threadList.add(tread);
        }

        for (Thread thread : threadList) {
            try {
                thread.join();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        long b = System.currentTimeMillis();
        System.out.println(b - a);
    }

    public static float[] changeArray(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("stop");
        return array;
    }

    private static List generateArray(int shift) {
        List<float[]> list = new ArrayList<>();
        for (int i = 0; i < size; i += shift) {
            float[] arr = new float[shift];
            for (int j = i; j < arr.length; j++) {
                arr[i] = 1;
            }
            list.add(arr);
        }
        return list;
    }

}


