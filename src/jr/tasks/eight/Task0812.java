package jr.tasks.eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной
последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая
длинная последовательность повторяющихся чисел состоит из трех четверок.


Требования:
1. Программа должна выводить число на экран.
2. Программа должна считывать значения с клавиатуры.
3. В методе main объяви переменную типа List с типом
элементов Integer и сразу проинициализируй ee.
4. Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5. Программа должна выводить на экран
длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Task0812 {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, Integer.parseInt(br.readLine()));
        }
        int maxCount = 1;
        int reCount = 1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i + 1).equals(list.get(i))) {
                reCount++;
                if (reCount >= maxCount) {
                    maxCount = reCount;
                }
            } else reCount = 1;
        }
        System.out.println(maxCount);
    }
}