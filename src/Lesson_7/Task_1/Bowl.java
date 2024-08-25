package Lesson_7.Task_1;

public class Bowl {
    static double foodAmount;
    public Bowl(){System.out.println("В миске пусто" );}
    // Конструктор миски, который инициализирует количество еды
    public Bowl(double a){
        foodAmount = a;
        System.out.println("В миске " + foodAmount + " еды." );
    }

    // Метод для добавления еды в миску
    public void addFood(double f){
        foodAmount += f;
        System.out.println("В миску добавлено " + f + " еды. Всего еды " + foodAmount);
    }

    // Метод для уменьшения количества еды в миске
    boolean decreaseFood(float amount) {
        // Если еды достаточно, уменьшаем количество и возвращаем true
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            // Если еды недостаточно, возвращаем false
            return false;
        }
    }

    // Метод для получения текущего количества еды в миске
    public double getFoodAmount() {
        return foodAmount;
    }
}
