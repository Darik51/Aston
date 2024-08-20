import Lesson_6.Employee;
import Lesson_6.Park;

public class Main {
    public static void main(String[] args) {
        // Создание массива из 5 сотрудников
        Employee[] employees = new Employee[5];

        // Заполнение массива даныыми о сотрудниках
        employees[0] = new Employee("Иванов Иван", "Менеджер", "ivanov.i@mail.ru", "89312753645", 35700, 25);
        employees[1] = new Employee("Сидоров Илья", "Старший менеджер", "sidorov.i@mail.ru", "89312753678", 55400, 27);
        employees[2] = new Employee("Михайлов Алексей", "Менеджер", "mikhailov.a@mail.ru", "89312753482", 35700, 20);
        employees[3] = new Employee("Алексеев Сергей", "Руководитель", "alekseev.s@mail.ru", "89312753731", 75200, 34);
        employees[4] = new Employee("Сергеев Антон", "Менеджер", "sergeev.a@mail.ru", "8931275390", 35700, 22);

        // Вывод информации о каждом сотруднике
        for (Employee employee : employees) {
            employee.printInfo();
        }

        // Создание объекта класса Park
        Park park = new Park();

        // Вызов метода createAttractions() для объекта park
        park.createAttractions();
    }

}
