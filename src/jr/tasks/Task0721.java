package jr.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0721 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int minimum;

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        maximum = array[0];
        minimum = array[0];
        for (int i = 1; i < array.length; i++) {
            if (minimum > array[i])     // поиск минимума/максимума
                minimum = array[i];
            if (maximum < array[i])
                maximum = array[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}
