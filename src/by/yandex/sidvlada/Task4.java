package by.yandex.sidvlada;

public class Task4 {

    public void Bookkeeping() {

        int n = 23456789;
        String s = Integer.toString(n);

        String[] numb = s.split("");
        int array[] = new int[numb.length];

        for (int i = 0; i < numb.length; i++) {
            array[i] = Integer.parseInt(numb[i]);
        }

       if (array.length == 8) {
           System.out.print(""+array[0]+array[1] + " " + array[2]+array[3]+array[4]+ " " + array[5]+array[6]+array[7]);
            }
        }
    }




