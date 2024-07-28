import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;

        while (true) {
            System.out.print("Enter path to file: ");
            File file = new File(scanner.nextLine());

            if (file.exists()) {
                if (file.isDirectory()) {
                    System.out.print("This is a directory, not a file. ");
                    continue;
                }
            } else {
                System.out.print("Incorrect path. ");
                continue;
            }

            System.out.println("Correct path. This is file #" + count);
            count++;
        }
    }
}
