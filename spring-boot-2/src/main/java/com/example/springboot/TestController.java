package com.example.springboot;

//import java.net.MalformedURLException;
import java.net.*;


import java.io.IOException;
import java.util.Scanner;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
    @GetMapping("/")
	public String index() throws IOException {
        return "Hello!";
	}

    @GetMapping("/testone")
    public String testone() throws IOException {
        URL url = new URL("http://localhost:8080/test1");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        StringBuilder sb = new StringBuilder();

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK){
            Scanner scanner = new Scanner(connection.getInputStream());
            while (scanner.hasNext()){
                sb.append(scanner.nextLine());
            }
        }
		return sb.toString();
    }

    @GetMapping("/testtwo")
    public String testtwo() throws IOException {
        URL url = new URL("http://localhost:8080/test2");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        StringBuilder sb = new StringBuilder();

        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK){
            Scanner scanner = new Scanner(connection.getInputStream());
            while (scanner.hasNext()){
                sb.append(scanner.nextLine());
            }
        }
		return sb.toString();
    }
}
