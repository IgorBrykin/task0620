package jr.tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCatDel {

    private final String name;

    public ArrayCatDel(String name) {
        this.name = name;
    }

    public static void main(String[] args) {


        ArrayCatDel[] cats = new ArrayCatDel[4];
        cats[0] = new ArrayCatDel("Томас");
        cats[1] = new ArrayCatDel("Бегемот");
        cats[2] = new ArrayCatDel("Филипп Маркович");
        cats[3] = new ArrayCatDel("Пушок");

        cats[1] = null;

        for (int i = 2; i < cats.length - 1; i++) {
            cats[i - 1] = cats[i];//перемещаем элементы к началу,
            // чтобы пустая ячейка оказалась в конце
        }

        System.out.println(Arrays.toString(cats));

        ArrayList<ArrayCatDel> cats1 = new ArrayList<>();
        ArrayCatDel thomas = new ArrayCatDel("Томас");
        ArrayCatDel behemoth = new ArrayCatDel("Бегемот");
        ArrayCatDel philipp = new ArrayCatDel("Филипп Маркович");
        ArrayCatDel pushok = new ArrayCatDel("Пушок");

        cats1.add(thomas);
        cats1.add(behemoth);
        cats1.add(philipp);
        cats1.add(pushok);
        System.out.println(cats1.toString());

        cats1.remove(1); //Удаляем элемент, массива

        System.out.println(cats1.toString());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}