package jr.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0705 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[20];
        int[] halfOne = new int[10];
        int[] halfTwo = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < halfOne.length; i++) {
            halfOne[i] = a[i];
        }
        for (int i = 0; i < halfTwo.length; i++) {
            halfTwo[i] = a[i + 10];// Запоолняем дальше массивы после 10++
        }
        for (int i : halfTwo) {
            System.out.println(i); // посредством iter выводим halfTwo
        }
    }
}
