package Lesson_7.Task_2;

public interface Shape {
    double calculateArea(); // Метод для расчета площади
    double calculatePerimeter(); // Метод для расчета периметра

    // Методы для работы с цветами
    String getFillColor();
    String getBorderColor();

    // Метод для вывода информации о фигуре
    public void printShapeInfo();
}
