package builder;

public class HttpClient {
    private final String method;
    private final String url;
    private final String body;

    public HttpClient(HttpClientBuilder builder){
        this.method = builder.method;
        this.url = builder.url;
        this.body = builder.body;
    }

    public static class HttpClientBuilder{
        private String method;
        private String url;
        private String body;

        public static HttpClientBuilder getNewInstance(){
            return new HttpClientBuilder();
        }

        private HttpClientBuilder(){}

        public HttpClientBuilder setMethod(String method){
            this.method = method;
            return this;
        }

        public HttpClientBuilder setUrl(String url){
            this.url = url;
            return this;
        }

        public HttpClientBuilder setBody(String body){
            this.body = body;
            return this;
        }

        public HttpClient build(){
            return new HttpClient(this);
        }
    }

    public String getMethod(){
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public String getBody() {
        return this.body;
    }
}
