package firstjava;

import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class WebClient2 {
    public static void main(String[] args) throws IOException {
        var domain = "naver.com";
        SocketFactory factory = SSLSocketFactory.getDefault();
        try(Socket sk = factory.createSocket(domain, 443);
        var pw = new PrintWriter(sk.getOutputStream());
        var isr = new InputStreamReader(sk.getInputStream());
        var bur = new BufferedReader(isr))
        {
            pw.println("GET / index.html HTTP/1.1");
            pw.println("HOST: " + domain);
            pw.println();
            pw.flush();
            bur.lines().limit(18).forEach(System.out::println);
        }
    }
}
