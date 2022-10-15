package course1.arrays2;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
        runHomeWorkTask1();
        runHomeWorkTask2();
        runHomeWorkTask3();
        runHomeWorkTask4();
    }
    public static void runHomeWorkTask1() {
        //Задача 1
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Сумма трат за месяц составила … рублей».

        int[] arr = generateRandomArray();
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }
    public static void runHomeWorkTask2() {
        //Задача 2
        // Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».

        int[] arr = generateRandomArray();
        int minExpense = -1;
        int maxExpense = -1;
        for (int j : arr) {
            if (j > maxExpense) {
                maxExpense = j;
            }
            if (j < maxExpense) {
                minExpense = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minExpense + " рублей. Максимальная сумма трат за день составила " + maxExpense + " рублей");
    }
    public static void runHomeWorkTask3() {
        //Задача 3
        // А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц
        //поделить на количество дней), и вывести в консоль результат в формате:
        // «Средняя сумма трат за месяц составила … рублей».

        int[] arr = generateRandomArray();
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        double averageSum = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageSum);
        System.out.println();
    }
    public static void runHomeWorkTask4() {
        //Задание 4
        //Отойдем от подсчетов.
        //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О. сотрудников начали
        //отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        //Данные с именами сотрудников хранятся в виде массива символов (char[]).
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        //В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено "Ivanov Ivan".

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = reverseFullName.length -1;
        int newIndex = 0;
        for (int i = 0; i <= reverseFullName.length - 1; i++) {
            newIndex = length;
            length --;
            System.out.print(reverseFullName[newIndex]);
        }
        System.out.println();
    }
}