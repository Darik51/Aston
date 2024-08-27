import Lesson_8.MyArrayDataException;
import Lesson_8.MyArraySizeException;
import Lesson_8.ArrayProcessor;


public class Main {
    public static void main(String[] args) {
        // Пример массива
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        ArrayProcessor processor = new ArrayProcessor();

        try {
            int result = processor.processArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }
    }
}