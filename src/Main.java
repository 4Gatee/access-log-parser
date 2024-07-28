import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while (true) {
            System.out.print("Enter path to file: ");
            File file = new File(scanner.nextLine());
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.print("Incorrect path. ");
                continue;
            }

            if (isDirectory) {
                System.out.print("This is a directory, not a file. ");
                continue;
            }

            System.out.println("Correct path. This is file #" + count);
            count++;
        }
    }
}
