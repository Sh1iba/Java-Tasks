package task09;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {27, 97, 86, 88, 31, 46, 59, 48, 16, 4};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int temp = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

}
