package jr.tasks;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task0702 {
    public static void main(String[] args) throws Exception {
        String[] arr = new String[10];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length - 2; i++) {
            arr[i] = br.readLine();
        }
        for (int i = arr.length; i > 0; i--) {
            System.out.println(arr[i-1]);
        }
    }
}
