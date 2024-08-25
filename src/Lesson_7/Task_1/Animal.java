package Lesson_7.Task_1;

public class Animal {
    // Статическая переменная для подсчета общего количества созданных животных
    public static int animalCount = 0;

    // Конструктор, который увеличивает счетчик при создании каждого нового животного
    public Animal() {
        animalCount++;
    }

    // Метод для бега, общий для всех животных
    public void run(double distance){
        String answer = (distance > 0) ? "Животное пробежало " + distance + " м." : "Введите дистанцию больше 0";
        System.out.println(answer);
        //System.out.println(this.name + " пробежал " + distance + " метров.");
    }

    // Метод для плавания, общий для всех животных
    public void swim(double distance) {
        System.out.println("Животное проплыло" + distance + " м.");
    }
}
