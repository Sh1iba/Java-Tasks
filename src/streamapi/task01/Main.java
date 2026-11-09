package streamapi.task01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("src/streamapi/task01/source.bin")) {
            FileOutputStream out = new FileOutputStream("src/streamapi/task01/dest.bin");
            int i = 0;
            while (i != -1) {
                i = in.read();
                out.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
