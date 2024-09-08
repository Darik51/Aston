import java.util.*;
import Lesson_11.PhoneBook;


public class Main {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Задание №1");
        System.out.println("----------");

        // Массив слов с повторениями
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "orange", "grape", "melon"};

        // Используем коллекцию Map для подсчета количества повторений слов
        Map<String, Integer> wordCount = new HashMap<>();

        // Проходим по массиву и считаем количество повторений каждого слова
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Выводим уникальные слова и количество их повторений
        System.out.println("Уникальные слова и их количество:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("----------");
        System.out.println("Задание №2");
        System.out.println("----------");

        // Создание телефонного справочника
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем записи
        phoneBook.add("Иванов", "123-4567");
        phoneBook.add("Петров", "987-6543");
        phoneBook.add("Иванов", "111-2222");
        phoneBook.add("Сидоров", "333-4444");

        // Поиск номеров по фамилии
        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны Смирнова: " + phoneBook.get("Смирнов"));  // однофамильцы отсутствуют
    }
}
