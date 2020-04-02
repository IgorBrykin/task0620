package jr.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayListSee {


    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);

//ввод строк с клавиатуры
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s);
        }

//вывод содержимого коллекции на экран
        for (int i = 0; i < list.size(); i++) { // Это вывод на экран с начала до конца
            System.out.print(list.get(i));
        }
        System.out.println();
        for (int i = 0; i < list.size(); i++) {  // Это вывод на экран с начала до конца
            int j = list.size() - i - 1;
            System.out.println(list.get(j));
        }
    }
}
