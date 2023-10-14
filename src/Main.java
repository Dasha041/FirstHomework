import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        printMenu();
        int input = scanner.nextInt();
        while (input != 0) {
            if (input == 1) {
                manager.readAndOut();
            } else if (input == 2) {
                manager.readAndWriteToFile();
            } else if (input == 3) {
                manager.readFile();
            } else if (input == 4) {
                manager.readAndWriteToBeginFile();
            } else if (input == 5) {
                manager.createArray();
            } else if (input == 6) {
                manager.createArrayAndPrint();
            } else if (input == 7) {
                manager.createRandom();
            } else if (input == 8) {
                manager.createRandomInterval();
            } else if (input == 9) {
                manager.reverseArray();
            } else if (input == 10) {
                manager.sortArray();
            } else if (input == 11) {
                manager.minAndMax();
            } else if (input == 12) {
                manager.findNod();
            } else if (input == 13) {
                manager.checkSum();
            }
            printMenu();
            input = scanner.nextInt();
        }
    }

    private static void printMenu() {
        System.out.println("\tВведите номер задания");
        System.out.println("1) Считать информацию с клавиатуры. Оформить и вывести на экран");
        System.out.println("2) Считать информацию с клавиатуры и записать в файл");
        System.out.println("3) Считать информацию из файла и вывести на экран");
        System.out.println("4) Считать информацию с клавиатуры. и записать в фначало файла");
        System.out.println("5) Создать массив в виде вектора и вывести на экран");
        System.out.println("6) Считать вектор с клавиатуры. Оформить и вывести на экран");
        System.out.println("7) Создать вектор, заполнить генератором случайных значений. Вывести на экран");
        System.out.println("8) Создать вектор и заполнить его генератором случайных значений, в диапазоне считанном с клавиатуры. Записать в файл");
        System.out.println("9) Полученный вектор вывести в обратной последовательности");
        System.out.println("10) Полученный вектор отсортировать. по возрастанию\\по убыванию - в зависимости от ключа с клавиатуры");
        System.out.println("11) В полученном вектор найти минимальное\\максимальное значение - в зависимости от ключа с клавиатуры");
        System.out.println("12) В полученном векторе найти НОД");
        System.out.println("13) Считать 2 вектора произвольной длинны. Сравнить сумму векторов. Вывести вектор с наименьшей суммой");
        System.out.println("\tВведите 0 для выхода");
    }
}