package builder;

public class BuilderMain {
    public static void main(String[] args) {
        System.out.println("Testing Builder Pattern");

        HttpClient httpPostClient = HttpClient.HttpClientBuilder
                .getNewInstance()
                .setMethod("POST").setUrl("TEST URL").setBody("{}")
                .build();
        System.out.println(httpPostClient.getMethod() + " " + httpPostClient.getUrl() + " " + httpPostClient.getBody());

        HttpClient httpGetClient = HttpClient.HttpClientBuilder
                .getNewInstance()
                .setMethod("GET").setUrl("TEST URL")
                .build();
        System.out.println(httpGetClient.getMethod() + " " + httpGetClient.getUrl());
    }
}
