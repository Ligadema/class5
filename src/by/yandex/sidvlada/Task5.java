package by.yandex.sidvlada;
import java.util.Scanner;

public class Task5 {

    public void Random() {
        long array[] = new long[5];
        long sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(100 * Math.random());
            //System.out.print(array[i]);
        }

        for( long num : array) {
            sum += num;
        }
        System.out.println("Sum of your array: " + sum);
    }

}