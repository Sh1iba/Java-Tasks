package task02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = "";
        String password = "";
        boolean isValid = false;
        do {
            name = scanner.nextLine();
            if (name.charAt(0) == ' ' || name.charAt(name.length() - 1) == ' ') {
                System.out.println("Имя не должно содержать пробелов в начале и в конце строки");
                continue;
            }
            isValid = true;
        } while (!isValid);
        isValid = false;
        System.out.println("Введите пароль");
        do {
            password = scanner.nextLine();
            if (password.charAt(0) == ' ' || password.charAt(password.length() - 1) == ' ') {
                System.out.println("Пароль должен быть от 8 до 15 символов");
                continue;
            }
            isValid = true;
        } while (!isValid);
        System.out.printf("%nИмя: %s%nПароль: %s", name, password);
    }
}
