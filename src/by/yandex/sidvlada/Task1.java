package by.yandex.sidvlada;

public class Task1 {

          public void MaxCharacter() {

            int array[] = new int[3];
            int max = 0;

            for (int i = 0; i <= array.length; i++) {
                array[i] = (int) (Math.random() * 100);

                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println("Maximum element: " + max);
        }
    }
