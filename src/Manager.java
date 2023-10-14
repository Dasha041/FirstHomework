import java.util.*;

public class Manager {
    private final Scanner scanner = new Scanner(System.in);
    private final Worker worker;

    public Manager() {
        this.worker = new Worker();
    }

    public void readAndOut() {
        System.out.print("Введите текст: ");
        String string = scanner.next();
        System.out.println(string);
    }

    public void readAndWriteToFile() {
        System.out.print("Введите текст: ");
        String string = scanner.next();
        String name = "Result.txt";
        worker.loadToFile(name, string);
    }

    public void readFile() {
        System.out.print("Введите имя файла: ");
        String file = scanner.next();
        List<String> lines = worker.readFromFile(file);
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public void readAndWriteToBeginFile() {
        System.out.print("Введите текст: ");
        String string = scanner.next();
        System.out.print("Введите имя файла: ");
        String file = scanner.next();
        List<String> lines = worker.readFromFile(file);
        lines.add(0, string);
        worker.loadToFileList(file, lines);
        for (String line : lines) {
            System.out.println(line);
        }
    }

    public void createArray() {
        List<Integer> list = List.of(24, 36, 48, 60);
        System.out.println(list);
    }

    public void createArrayAndPrint() {
        List<Integer> list = worker.createList();
        System.out.println(list);
    }

    public void createRandom() {
        Random random = new Random(1);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < random.nextInt(10); i++)
            list.add(random.nextInt(1000));
        System.out.println(list);
    }

    public void createRandomInterval() {
        System.out.print("Нижнее значение: ");
        int first = scanner.nextInt();
        System.out.print("Верхнее значение: ");
        int second = scanner.nextInt();
        Random random = new Random(first);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(random.nextInt(second));
        System.out.print("Введите имя файла: ");
        String file = scanner.next();
        worker.loadToFile(file, list.toString());
        System.out.println(list);
    }

    public void reverseArray() {
        List<Integer> list = worker.createList();
        Collections.reverse(list);
        System.out.println(list);
    }

    public void sortArray() {
        List<Integer> list = worker.createList();
        System.out.println(list);
        System.out.println("1. По возрастанию");
        System.out.println("2. По убыванию");
        int flag =  scanner.nextInt();
        if (flag == 1) {
            Collections.sort(list);
        } else if (flag == 2) {
            Collections.sort(list);
            Collections.reverse(list);
        } else {
            System.out.println("Неправильная команда");
        }
        System.out.println(list);
    }

    public void minAndMax() {
        List<Integer> list = worker.createList();
        System.out.println(list);
        System.out.println("1. Min");
        System.out.println("2. Max");
        int flag =  scanner.nextInt();
        if (flag == 1) {
            System.out.println(Collections.min(list));
        } else if (flag == 2) {
            System.out.println(Collections.max(list));
        } else {
            System.out.println("Неправильная команда");
        }
    }

    public void findNod() {
        List<Integer> list = worker.createList();
        System.out.println(list);
        System.out.println(worker.findNOD(list));
    }

    public void checkSum() {
        List<Integer> list = worker.createList();
        System.out.println(list);
        List<Integer> list2 = worker.createList();
        System.out.println(list2);
        int sum = worker.sum(list);
        int sum2 = worker.sum(list2);
        if (sum > sum2)
            System.out.println(list);
        else
            System.out.println(list2);
    }

}
