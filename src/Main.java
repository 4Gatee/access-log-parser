import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int first_number = new Scanner(System.in).nextInt();

        System.out.println("Введите второе число:");
        int second_number = new Scanner(System.in).nextInt();

        int sum = first_number + second_number;
        System.out.println("Сумма чисел: " + sum);

        int diff = first_number - second_number;
        System.out.println("Разность чисел: " + diff);

        int product = first_number * second_number;
        System.out.println("Произведение чисел: " + product);

        double quotient = (double) first_number / second_number;
        System.out.println("Частное чисел: " + quotient);
    }
}    
