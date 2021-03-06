package firstjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.io.PrintWriter;

public class WebClient {
    public static void main(String[] args) throws IOException {
        var domain = "example.com";
        try (var sk = new Socket(domain, 80);
        var pw = new PrintWriter(sk.getOutputStream());
        var isr = new InputStreamReader(sk.getInputStream());
        var bur = new BufferedReader(isr))
        {
            pw.println("GET / index.html HTTP/1.1");
            pw.println("HOST" + domain);
            pw.println();
            pw.flush();
            bur.lines().limit(18).forEach(System.out::println);
        }
    }
}
