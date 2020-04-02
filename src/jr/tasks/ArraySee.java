package jr.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ArraySee {
    public static void main(String[] args) throws IOException {

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//ввод строк с клавиатуры
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++) {
            String s = br.readLine();
            list[i] = s;
        }

//вывод содержимого массива на экран
        for (int i = 0; i < list.length ; i++) { // Это вывод на экран с начала до конца
            System.out.print(list[i]);
        }
        System.out.println();
        for (int i = 0; i < list.length; i++) { // Это вывод на экран с конца в начало
            int j = list.length - i - 1;
            System.out.print(list[j]);
        }
    }
}
