import Lesson_7.Task_1.Animal;
import Lesson_7.Task_1.Cat;
import Lesson_7.Task_1.Dog;
import Lesson_7.Task_1.Bowl;
import Lesson_7.Task_2.Shape;
import Lesson_7.Task_2.Circle;
import Lesson_7.Task_2.Rectangle;
import Lesson_7.Task_2.Triangle;

//import static Lesson_7.Task_2.Shape.printShapeInfo;


public class Main {
    public static void main(String[] args) {
        System.out.println("----------");
        System.out.println("Задание №1");
        System.out.println("----------");

        Animal elephant = new Animal(); // Создаем объект класса животное
        // Животное выполняет действия (бег и плавание)
        elephant.swim(160);
        elephant.run(-50);

        // Создаем объекты классов кот и собака
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        // Коты и собаки выполняют действия (бег и плавание)
        System.out.println("--------------------");
        cat1.run(150);
        cat1.swim(5);
        cat2.run(350);
        cat2.run(-5);
        dog1.run(450);
        dog1.swim(5);
        dog2.run(-100);
        dog2.swim(15);
        System.out.println("--------------------");


        // Создаем миску с едой
        Bowl bowl = new Bowl(20);

        // Коты едят из миски
        cat1.eat(bowl, 10);
        cat1.eat(bowl, 10);
        cat2.eat(bowl, 20);

        // Добавляем еды в миску
        bowl.addFood(40);
        System.out.println("--------------------");

        // Создаем массив котов
        Cat[] cats = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};
        for (Cat cat : cats) {
            cat.eat(bowl, 15);
        }
        System.out.println("--------------------");


        // Выводим в консоль количество созданных животных, котов и собак
        System.out.println("Всего животных: " + Animal.animalCount);
        System.out.println("Котов: " + Cat.catCount);
        System.out.println("Собак: " + Dog.dogCount);


        System.out.println("----------");
        System.out.println("Задание №2");
        System.out.println("----------");

        Shape circle = new Circle(5, "Red", "Black");
        Shape rectangle = new Rectangle(4, 6, "Blue", "Green");
        Shape triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        // Вывод информации о фигурах
        circle.printShapeInfo();
        rectangle.printShapeInfo();
        triangle.printShapeInfo();
    }
}