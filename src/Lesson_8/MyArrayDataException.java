package Lesson_8;

// Исключение для ошибок данных в массиве
public class MyArrayDataException extends Exception {
    public MyArrayDataException(String message) {
        super(message);
    }
}
