package jr.tasks.seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк.
Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.


Требования:
1. Объяви переменную типа ArrayList<String>
(список строк) и сразу проинициализируй ee.
2. Считай 5 строк с клавиатуры и добавь их в список.
3. Удали третий элемент списка.
4. Выведи элементы на экран, каждый с новой строки.
5. Порядок вывода должен быть обратный.
*/

public class Task0714 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = new ArrayList<String>(); // Объяви переменную типа ArrayList<String>
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {   //Считай 5 строк с клавиатуры и добавь их в список.
            String s = br.readLine();
            words.add(s);
        }
        words.remove(2); //Удали третий элемент списка.
        for (int i = words.size(); i > 0 ; i--) {   //Выведи элементы на экран, каждый с новой строки.
            System.out.println(words.get(i-1));     //Порядок вывода должен быть обратный.
        }
    }
}
