package Lesson_7.Task_1;

public class Dog extends Animal{
    // Статическая переменная для подсчета общего количества созданных собак
    public static int dogCount = 0;

    // Конструктор, который увеличивает счетчик собак при создании каждой новой собаки
    public Dog() {
        dogCount++;
    }

    // Переопределенный метод для бега, специфичный для собак
    @Override
    public void run(double distance) {
        if (distance > 0) {
            if (distance < 500) {
                System.out.println("Собака пробежала " + distance + " м.");
            } else {
                System.out.println("Дистанция слишком большая. " + "Собака может пробежать до 500 м.");
            }
        } else {System.out.println("Введите дистанцию больше 0");}
    }

    // Переопределенный метод для плавания, специфичный для собак
    @Override
    public void swim(double distance) {
        if (distance > 0) {
            if (distance < 10) {
                System.out.println("Собака проплыла " + distance + " м.");
            } else {
                System.out.println("Дистанция слишком большая. " + "Собака может проплыть до 10 м.");
            }
        } else {System.out.println("Введите дистанцию больше 0");}
    }
}
