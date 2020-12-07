package ru.geekbrains.lesson3;

import java.util.*;

public class Test1 {

    public static void main(String[] args) {
        String[] strings = {"s1", "s2", "s3", "s4", "s5", "s6", "s7", "s8", "s9", "s10", "s1", "s1", "s3", "s4", "s4", "s4", "s1", "s1", "s5", "s1"};
        Set<String> setOfStrings = new HashSet<>(Arrays.asList(strings));
        for (String word : setOfStrings) {
            System.out.println(word);
        }

        List<String> list = Arrays.asList(strings);
        for (String word : setOfStrings) {
            System.out.println(word + " frequency is " + Collections.frequency(list, word));
        }
    }

}
