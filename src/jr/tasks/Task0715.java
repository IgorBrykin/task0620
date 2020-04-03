package jr.tasks;

import java.util.ArrayList;

public class Task0715 {
    public static void main(String[] args) {
        ArrayList<String> mwf = new ArrayList<String>();

        String s = "именно";
        mwf.add("мама");
        mwf.add("мыла");
        mwf.add("раму");
        for (int i = 0; i < mwf.size(); i = i + 2) {
            mwf.add(i + 1, s); //
        } // После каждого слова добавь в список строку, содержащую слово «именно».

        for (String s1 : mwf) {
            System.out.println(s1);
        }

    }
}
