package task06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "";
        System.out.println("Введите слово");
        do {
            string = sc.nextLine();
            if(string.contains(" ")){
                System.out.println("Введите корректное имя!");
            }
        }while (string.contains(" "));
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.reverse();
        System.out.println("Слово наоборот - " + stringBuilder.toString());
    }
}
