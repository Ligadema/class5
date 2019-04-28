package by.yandex.sidvlada;
import java.util.Scanner;

public class Task3 {

    public void NaturalNumber() {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("This number is not natural.");
            System.exit(0);
        }

        for (int i = 2; i < n; i++) {
            int x = n % i;
            if (x > 0) {
                System.out.println("Yes! This number is natural.");
                break;
            } else System.out.println("This number is not natural.");
            break;
        }
    }
}