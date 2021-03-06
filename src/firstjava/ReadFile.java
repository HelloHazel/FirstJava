package firstjava;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        Path p = null;
        try {
            p = Path.of("test.txt");
            String s = Files.readString(p);
            System.out.println(s);
        } catch (NoSuchFileException e) {
            System.out.println("파일 찾을 수 없음 : " + e.getFile());;
        }
    }
}
