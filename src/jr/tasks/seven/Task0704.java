package jr.tasks.seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0704 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = arr.length; i > 0; i--) {
            System.out.println(arr[i - 1]);    //переворот масссива
        }
    }
}
