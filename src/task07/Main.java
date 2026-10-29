package task07;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] participants = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        printArray(participants);
        String temp = "";
        for (int i = 0; i < participants.length / 2; i++) {
            temp = participants[i];
            participants[i] = participants[participants.length - 1 - i];
            participants[participants.length - 1 - i] = temp;
        }
        printArray(participants);
    }

    public static void printArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }

}
