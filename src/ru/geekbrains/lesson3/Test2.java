package ru.geekbrains.lesson3;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivan1", "8-800-555-35-35");
        phonebook.add("Ivan1", "8-800-555-35-36");
        phonebook.add("Ivan2", "8-800-555-35-37");
        phonebook.add("Ivan3", "8-800-555-35-38");
        phonebook.add("Ivan4", "8-800-555-35-39");

        List<String> numbers1 = phonebook.get("Ivan1");
        for (String s : numbers1) {
            System.out.println(s);
        }
        List<String> numbers2 = phonebook.get("Ivan2");
        for (String s : numbers2) {
            System.out.println(s);
        }
    }
}
