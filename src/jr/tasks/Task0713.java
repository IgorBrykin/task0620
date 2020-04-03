package jr.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Task0713 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> three = new ArrayList<Integer>();
        ArrayList<Integer> two = new ArrayList<Integer>();
        ArrayList<Integer> one = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            String s = br.readLine();
            arr.add(Integer.parseInt(s));
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0 && arr.get(i) % 3 == 0){
                two.add(arr.get(i));    //Запись элементов в массив arr в two
                three.add(arr.get(i));
            } else if (arr.get(i) % 3 == 0){
                three.add(arr.get(i));
            } else if (arr.get(i) % 2 == 0 ){
                two.add(arr.get(i));
            }else {
                one.add(arr.get(i));
            }
        }

        printList(three);   // метод принимающий массив
        printList(two);
        printList(one);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
