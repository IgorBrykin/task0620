package jr.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task0711 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            list.add(s);
        }
        for (int i = 0; i < 13; i++) {
            list.add(0, list.remove(4)); // remove(); удаляет элемент и
            //добовляет его в начало

        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
