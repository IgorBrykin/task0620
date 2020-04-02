package jr.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task0710 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = br.readLine();
            list.add(0, s); // добавляем вначало
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
