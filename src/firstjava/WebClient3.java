package firstjava;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WebClient3 {
    public static void main(String[] args) throws IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        URI uri = URI.create("https://example.com/");
        HttpRequest req = HttpRequest.newBuilder(uri).build();
        HttpResponse<String> response = client.send (
                req, HttpResponse.BodyHandlers.ofString());
        String body = response.body();
        body.lines()
                .limit(10)
                .forEach(System.out::println);
        String hd = String.valueOf(response.headers());
        hd.lines().forEach(System.out::println);
    }
}
