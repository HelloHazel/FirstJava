package firstjava;

import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFile3 {
    public static void main(String[] args) {
        var p = Path.of("test.txta");
        String s;
        try {
            s = Files.readString(p);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
