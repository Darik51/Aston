package Lesson_7.Task_1;

public class Cat extends Animal{
    public static int catCount = 0;
    private boolean satiety; // Поле для хранения состояния сытости кота

    // Конструктор, который увеличивает счетчик котов при создании каждого нового кота
    public Cat() {
        catCount++;
        this.satiety = false; // По умолчанию кот голоден
    }

    // Переопределенный метод для бега, специфичный для котов
    @Override
    public void run(double distance) {
        if (distance > 0) {
            if (distance < 200) {
                System.out.println("Кот пробежал " + distance + " м.");
            } else {
                System.out.println("Дистанция слишком большая. Кот может пробежать до 200 м.");
            }
        } else {System.out.println("Введите дистанцию больше 0 м");}
    }

    // Переопределенный метод для плавания, специфичный для котов
    @Override
    public void swim(double distance) {
        System.out.println("Кот не умеет плавать.");
    }

    // Метод для кормления кота из миски
    public boolean eat(Bowl bowl, float a) {
        // Если кот голоден и в миске достаточно еды, он ест и становится сытым
        if (!satiety && bowl.decreaseFood(a)) {
            satiety = true;
            System.out.println("Кот поел " + a + " еды и сыт.");
            return true;
        } else if (satiety) {
            // Если кот уже сыт или еды недостаточно, он не ест
            System.out.println("Кот уже сыт.");
            return false;
        } else {
            System.out.println("Коту не хватило еды. В миске осталось " + bowl.getFoodAmount() + " еды.");
            return false;
            }
    }

    // Метод для проверки, сыт ли кот
    public boolean isSatiety() {
        return satiety;
    }
}
