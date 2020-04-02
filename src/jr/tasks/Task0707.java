package jr.tasks;

import java.util.ArrayList;

public class Task0707 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s1 = "Swog1";
        list.add(s1);
        String s2 = "Swog2";
        list.add(s2);
        String s3 = "Swog3";
        list.add(s3);
        String s4 = "Swog4";
        list.add(s4);
        String s5 = "Swog5";
        list.add(s5);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
