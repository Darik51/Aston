package Lesson_1;

public class Lesson1 {
    // Задание 1
    // Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова:
    // Orange, Banana, Apple
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Задание 2
    // Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b,
    // и инициализируйте их любыми значениями, которыми захотите. Далее метод должен
    // просуммировать эти переменные, и если их сумма больше или равна 0, то вывести
    // в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;
    public static void checkSumSign() {
        int a = 5;
        int b = 10;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    // Задание 3
    // Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее
    // любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести
    // сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно),
    // то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;
    public static void printColor(){
        int value = 30;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Задание 4
    // Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b,
    // и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b,
    // то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers(){
        int a = 10;
        int b = 15;
        if ( a >= b ){
            System.out.println("a >= b");
        } else System.out.println("a < b");
    }

    // Задание 5
    // Напишите метод, принимающий на вход два целых числа и проверяющий, что их сумма
    // лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean isSumBetween10And20(int a, int b){
        if ((a + b >= 10) && (a + b <=20)) {
            return true;
        } else {
            return false;
        }
    }

    // Задание 6
    // Напишите метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void printNumberSign(int a){
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // Задание 7
    // Напишите метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNumberNegative(int n){
        return n < 0;
    }

    // Задание 8
    // Напишите метод, который принимает строку и число.
    // Метод должен выводить в консоль данную строку указанное количество раз.
    public static void printStringMultipleTimes(String str, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    // Задание 9
    // Напишите метод, который определяет, является ли год високосным, и возвращает boolean
    // (високосный - true, не високосный - false). Каждый 4-й год является високосным,
    // за исключением каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year) {
        // Проверяем, делится ли год на 400
        if (year % 400 == 0) {
            return true;
        }
        // Проверяем, делится ли год на 100
        if (year % 100 == 0) {
            return false;
        }
        // Проверяем, делится ли год на 4
        return year % 4 == 0;
        // Если ни одно из условий не выполнено, год не является високосным
    }

    // Задание 10
    // Задайте целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [1, 1, 0, 0, 1, 1, 0, 0, 1]. С помощью цикла и условия замените 0 на 1, и 1 на 0.
    public static void swapValuesInArray(){
        int[] nums = {1,1,0,0,1,1,0,0,1};
        for (int i = 0; i < nums.length; i++) {
            // Если элемент равен 1, заменяем его на 0, и наоборот
            if (nums[i] == 1){
                nums[i] = 0;
            } else if (nums[i] == 0) {
                nums[i] = 1;
            }
            // Вывод значений массива для проверки
            System.out.println(nums[i]);
        }
    }

    // Задание 11
    // Задайте пустой целочисленный массив длиной 100.
    // С помощью цикла заполните его значениями от 1 до 100.
    public static void fillArray1to100(){
        int [] arr = new int[100];
        for (int i = 1; i < 101; i ++){
            arr[i-1] = i;
            // Вывод значений массива для проверки
            System.out.println(arr[i-1]);
        }
    }

    // Задание 12
    // Задайте массив [1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1] и пройдите по нему циклом,
    // умножая числа меньше 6 на 2.
    public static void doubleNumbersLessThanSix(){
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            // Вывод значений массива для проверки
            System.out.println(arr[i]);
        }
    }
    // Задание 13
    // Создать квадратный двумерный целочисленный массив
    //(количество строк и столбцов одинаковое), и с помощью цикла
    //(-ов) заполнить его диагональные элементы единицами
    //(можно только одну из диагоналей, если обе сложно).
    //Определить элементы одной из диагоналей можно по
    //следующему принципу: индексы таких элементов равны, то
    //есть [0][0], [1][1], [2][2], …, [n][n];
    public static void arrayDiagonal(int a){
        int [][] arr = new int [a][a];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < a; j++){
                // Заполнение единицами первой и второй диагоналей
                if (i == j || i + j == a-1){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    // Задание 14
    // Написать метод, принимающий на вход два аргумента: len и
    //initialValue, и возвращающий одномерный массив типа int
    //длиной len, каждая ячейка которого равна initialValue.
    public static int[] returnArray(int len, int initialValue) {
        int [] arr = new int [len];
        for (int i = 0; i < len; i++){
            arr[i] = initialValue;
            // Вывод значений массива для проверки
            System.out.print(arr[i]);
        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println("Задание 1:");
        printThreeWords();
        System.out.println();

        System.out.println("Задание 2:");
        checkSumSign();
        System.out.println();

        System.out.println("Задание 3:");
        printColor();
        System.out.println();

        System.out.println("Задание 4:");
        compareNumbers();
        System.out.println();

        System.out.println("Задание 5:");
        System.out.println(isSumBetween10And20(5, 15));
        System.out.println();

        System.out.println("Задание 6:");
        printNumberSign(5);
        System.out.println();

        System.out.println("Задание 7:");
        System.out.println(isNumberNegative(-6));
        System.out.println();

        System.out.println("Задание 8:");
        printStringMultipleTimes("Задание 8 выполняетя корректно", 3);
        System.out.println();

        System.out.println("Задание 9:");
        System.out.println(isLeapYear(200));
        System.out.println();

        System.out.println("Задание 10:");
        swapValuesInArray();
        System.out.println();

        System.out.println("Задание 11:");
        fillArray1to100();
        System.out.println();

        System.out.println("Задание 12:");
        doubleNumbersLessThanSix();
        System.out.println();

        System.out.println("Задание 13:");
        arrayDiagonal(5);
        System.out.println();

        System.out.println("Задание 14:");
        returnArray(5,7);

    }
}
