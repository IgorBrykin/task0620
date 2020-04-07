package jr.tasks.seven;

import java.util.ArrayList;
/*
Что за список такой?
1. Создай список строк.
2. Добавь в него 5 различных строк.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.


Требования:
1. Программа не должна ничего считывать с клавиатуры.
2. Объяви переменную типа ArrayList<String> (список строк)
и сразу проинициализируй ee.
3. Программа должна добавить 5 любых строк в список.
4. Программа должна вывести размер списка на экран.
5. Программа должна вывести содержимое списка на экран,
каждое значение с новой строки.
*/

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
