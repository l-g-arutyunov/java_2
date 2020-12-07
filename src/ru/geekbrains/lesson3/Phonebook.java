package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    Map<String, String> phonebook = new HashMap<>();

    public void add(String name, String phoneNumber) {
        phonebook.put(phoneNumber, name);
    }

    public List<String> get(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Map.Entry<String, String> pour : phonebook.entrySet()) {
            if (pour.getValue().equals(name)) {
                phoneNumbers.add(pour.getKey());
            }
        }
        return phoneNumbers;
    }
}
