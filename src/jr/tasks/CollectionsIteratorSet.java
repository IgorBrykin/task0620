package jr.tasks;

import java.util.*;

public class CollectionsIteratorSet {
    public static void main(String[] args)
    {
        //Вывод на экран элементов Set
        Set<String> set = new HashSet<String>();
        set.add("Mama");
        set.add("Mila");
        set.add("Ramu");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next();

            System.out.println(text);
        }

    }
}
