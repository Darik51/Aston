package Lesson_6;

public class Park {
    // Внутренний класс Attraction
    public class Attraction {
        private String name;
        private String workingHours;
        private double cost;

        // Конструктор класса Attraction
        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        // Метод для вывода информации об аттракционе
        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + cost);
            System.out.println("--------------------------");
        }
    }

    // Метод для создания и вывода информации о нескольких аттракционах
    public void createAttractions() {
        Attraction rollerCoaster = new Attraction("Американские горки", "10:00 - 22:00", 500);
        Attraction ferrisWheel = new Attraction("Колесо обозрения", "09:00 - 21:00", 300);
        Attraction bumperCars = new Attraction("Автодром", "11:00 - 23:00", 200);

        rollerCoaster.printInfo();
        ferrisWheel.printInfo();
        bumperCars.printInfo();
    }
}
