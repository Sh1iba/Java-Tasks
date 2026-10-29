package task08;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String text = """
                Жили-были старик со старухой.
                Вот и говорит старик старухе:
                — Поди-ка, старуха, по коробу поскреби, по сусеку помети, не наскребешь ли муки на колобок.
                """;
        String options = """
                1. Удалить пробелы.
                2. Сделать все заглавными или строчными.
                3. Посчитать количество символов.
                0. Выход из программы.
                """;
        while (true) {
            System.out.println(text);
            System.out.println(options);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(deleteSpace(text));
                    break;
                case 2:
                    System.out.println("1. Сделать заглавными\n2. Сделать строчными");
                    System.out.println(toUpperOrLowerCase(text));
                    break;
                case 3:
                    System.out.println("Кол-во символов: " + countSymbols(text) + "\n");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Введите корректную цифру");
            }
        }
    }

    public static String deleteSpace(String text) {
        return text.replace(" ", "");
    }

    public static String toUpperOrLowerCase(String text) {
        while (true) {
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    return text.toUpperCase();
                case 2:
                    return text.toLowerCase();
                default:
                    System.out.println("Введите корректную цифру 1 или 2");
            }
        }
    }

    public static int countSymbols(String text) {
        return text.replace(" ", "").length();
    }

}


