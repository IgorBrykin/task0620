package jr.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task0706 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (i % 2 == 0) {
                even = even + arr[i];
            } else odd = odd + arr[i];
        }

        System.out.println(even < odd ? "В домах с нечетными номерами проживает больше жителей.":"В домах с четными номерами проживает больше жителей.");

    }

}
