package firstjava;


import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        var server = new ServerSocket(2022);
        System.out.println("기다려주세요....");
        Socket sk = server.accept();
        System.out.println("연결: " +  sk.getInetAddress());
        InputStream is = sk.getInputStream();
        System.out.println(is.read()); is.close();
        sk.close();

    }
}
