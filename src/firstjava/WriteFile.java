package firstjava;

;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        var msg = """
                test
                msg
                """;
        var p = Path.of("test.txt");
        Files.writeString(p, msg);
    }
}
