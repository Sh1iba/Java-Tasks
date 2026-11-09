package streamapi.task02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = scanner.nextLine();

        try(Writer out = new FileWriter("user.txt", StandardCharsets.UTF_8)) {
            out.write(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
