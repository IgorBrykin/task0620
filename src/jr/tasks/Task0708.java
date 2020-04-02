package jr.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task0708 {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String s = br.readLine();
            strings.add(s);
//            if (strings.get(i).length() > max) {    // Выявления максимальной длинны
//                max = strings.get(i).length();// Присваивание
//            }
        }
            for (int i = 0; i < strings.size(); i++) {
                if (strings.get(i).length() > max)
                    max = strings.get(i).length();
            }
            for (String j : strings) {
                if (max == j.length()) {
                    System.out.println(j);
                }
            }
        }
    }
