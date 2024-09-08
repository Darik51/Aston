package Lesson_11;
import java.util.*;

public class PhoneBook {
    // Map для хранения фамилий и списка номеров
    private Map<String, List<String>> phoneBook = new HashMap<>();

    // Метод для добавления записи
    public void add(String surname, String phoneNumber) {
        // Если фамилия уже есть, добавляем новый номер
        phoneBook.putIfAbsent(surname, new ArrayList<>());
        phoneBook.get(surname).add(phoneNumber);
    }

    // Метод для получения номеров по фамилии
    public List<String> get(String surname) {
        // Если фамилия найдена, возвращаем список номеров, иначе возвращаем пустой список
        return phoneBook.getOrDefault(surname, Collections.emptyList());
    }
}