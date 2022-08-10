package Chap1;

import java.util.Scanner;

public class P000 {

    static int[] sorted; // 정렬된 배열을 임시로 저장할 변수

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        sorted = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Bubble Sort
        bubbleSort(n, arr);

        // Merge Sort
        mergeSort(arr, 0, n - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void bubbleSort(int n, int[] arr) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);
            merge(arr, start, middle, end);
        }

    }

    public static void merge (int[] arr, int m, int middle, int n) {
        int i = m;
        int j = middle + 1;
        int k = m;

        while (i <= middle && j <= n) {
            if (arr[i] <= arr[j]) {
                sorted[k] = arr[i];
                i++;
            } else {
                sorted[k] = arr[j];
                j++;
            }
            k++;
        }

        if (i > middle) {
            for (int t = j; t <= n; t++) {
                sorted[k] = arr[t];
                k++;
            }
        } else {
            for (int t = i; t <= middle; t++) {
                sorted[k] = arr[t];
                k++;
            }
        }

        // 정렬된 배열 삽입
        for (int t = m; t <= n; t++) {
            arr[t] = sorted[t];
        }
    }

}
