package Chap3;

import java.util.Arrays;
import java.util.Scanner;

public class P002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        double max = arr[arr.length - 1];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i] / max * 100;
        }

        double avg = sum / n;

        System.out.println(avg);

        scanner.close();

    }

}
