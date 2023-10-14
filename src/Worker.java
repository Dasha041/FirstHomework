import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Worker {
    private final Scanner scanner = new Scanner(System.in);
    private final String separator = File.separator;
    private final Path path = Paths.get("src" + separator + "files");
    private final Path absPath = path.toAbsolutePath();

    public int findNOD(List<Integer> list) {
        int gcd = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            gcd = findNOD(gcd, list.get(i));
        }
        return gcd;
    }

    public int sum(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    private int findNOD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public List<Integer> createList() {
        List<Integer> list = new ArrayList<>();
        System.out.print("Size: ");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Elem[" + i + "]: ");
            list.add(scanner.nextInt());
        }
        return list;
    }

    public void loadToFile(String name, String string) {
        try {
            File file = new File(absPath + separator + name);
            Writer fileWriter = new FileWriter(file);
            fileWriter.write(string);
            fileWriter.close();
            System.out.println("Записано в файл " + name + "!");
        } catch (IOException ex) {
            System.out.println("Ошибка записи!");
        }
    }

    public void loadToFileList(String name, List<String> list) {
        try {
            File file = new File(absPath + separator + name);
            Writer fileWriter = new FileWriter(file);
            for (String line: list)
                fileWriter.write(line + "\n");
            fileWriter.close();
            System.out.println("Записано в файл " + name + "!");
        } catch (IOException ex) {
            System.out.println("Ошибка записи!");
        }
    }

    public List<String> readFromFile(String name) {
        File file = new File(absPath + separator + name);
        List<String> lines = new ArrayList<>();
        try {
            Scanner fileScanner = new Scanner(file);
            if(!fileScanner.hasNext()) {
                System.out.println("Файл пустой!");
                return lines;
            }
            String line = fileScanner.nextLine();
            lines.add(line);
            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine();
                lines.add(line);
            }
            fileScanner.close();
        } catch (IOException ex) {
            System.out.println("Ошибка при чтении файла: " + file);
        }
        return lines;
    }
}
