package by.yandex.sidvlada;
import java.util.Scanner;

public class Task2 {

    public void SumOfNumber()    {

        System.out.println("Please, enter any number ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        Counting(n, sum);
    }

    public static void Counting(int n, int sum) {
        if (n != 0) {
            sum += n % 10;
            Counting(n / 10, sum);
        } else System.out.println("Sum of your number: " + sum);
    }
}