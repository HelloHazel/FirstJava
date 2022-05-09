package firstjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class WebServer {
    public static void main(String[] args) throws IOException {
        var server = new ServerSocket(8880);
        for(;;){
            try(Socket sk = server.accept();
                var isr = new InputStreamReader(sk.getInputStream());
                var bur = new BufferedReader(isr);
                var w = new PrintWriter(sk.getOutputStream()))
            {
                System.out.println("연결: " + sk.getInetAddress());
                bur.lines()
                        .takeWhile(line -> !line.isEmpty())
                        .forEach(System.out::println);
                w.println("""                     
                        HTTP/1.1 200 OK 
                        Content-Type: text/html
                        
                        <html><head><title>I love you! Baby! </title></head> 
                        <body><h1>I love you! Baby!</h1>From Hazel!</body></html>
                        """);
            }
        }
    }
}
