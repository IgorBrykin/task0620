package jr.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListGenerics {

    public static void main(String[] args) throws IOException {
        bufferInteger(); // Ввод списка целых чисел с клавиатуры
        addIntegerEven();// То же, чётные числа добавляются в конец списка, нечётные — в начало.
        delForFive(); // Удаление всех чисел больше 5:
        separation();   // Разделение массива на два — чётных и нечётных чисел
        merger(); // Слияние списков.

    }

    private static void merger() {
        ArrayList<Integer> list1 = new ArrayList<Integer>();   //создание списка
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   //заполнение списка

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);   //добавление всех значений из одного списка в другой
        result.addAll(list2);

        for (Integer x : result)   //быстрый for по всем элементам, только для коллекций
        {
            System.out.println(x);
        }
    }

    private static void separation() {
        //статическая инициализация массива
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        //создание списка, где все элементы должны быть типа Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        //заполнение списка из массива
        for (int i = 0; i < data.length; i++) list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>();  //чётные
        ArrayList<Integer> odd = new ArrayList<Integer>();    //нечётные

        for (int i = 0; i < list.size(); i++) {
            Integer x = list.get(i);
            if (x % 2 == 0)    //если x - чётное
                even.add(x);   // добавляем x в коллекцию четных чисел
            else
                odd.add(x);    // добавляем x в коллекцию нечетных чисел
        }
    }

    private static void delForFive() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size(); ) //убрали увеличение i внутрь цикла
        {
            if (list.get(i) > 5)
                list.remove(i);  //не увеличиваем i, если удалили текущий  элемент
            else
                i++;
        }

    }

    private static void addIntegerEven() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int x = Integer.parseInt(s);
            if (x % 2 == 0)  //проверяем, что остаток от деления на два равен нулю
                list.add(x);          //добавление в конец
            else
                list.add(0, x);      //вставка в начало
        }
    }

    private static void bufferInteger() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break; // Проверяет, что строка == пустая строка
            list.add(Integer.parseInt(s));
        }
    }
}
