package Lesson_8;

// Исключение для неправильного размера массива
public class MyArraySizeException extends Exception {
    public MyArraySizeException(String message) {
        super(message);
    }
}
