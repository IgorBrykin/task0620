package jr.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task0712 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int min = 0;
        int max = 0;
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        for (int i = 1; i < list.size(); i++) { // Поиск минимума и максимума
            if (list.get(max).length() < list.get(i).length()) {
                max = i;
                if (list.get(min).length() > list.get(i).length()) {
                    min = i;
                }       //запись единицы
            }
            if (max < min) {    //булево
                System.out.println(list.get(max));
            } else
                System.out.println(list.get(min));
        }
    }
}
