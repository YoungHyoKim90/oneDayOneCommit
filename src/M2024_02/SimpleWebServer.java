package M2024_02;
//
//import com.sun.net.httpserver.HttpServer;
//import com.sun.net.httpserver.HttpHandler;
//import com.sun.net.httpserver.HttpExchange;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.InetSocketAddress;
//
//public class SimpleWebServer {
//    public static void main(String[] args) throws IOException {
//        // 웹 서버 생성
//        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
//
//        // 컨텍스트 경로 설정
//        server.createContext("/", new MyHandler());
//
//        // 서버 시작
//        server.start();
//        System.out.println("웹 서버가 시작되었습니다. http://localhost:8080/");
//    }
//
//    static class MyHandler implements HttpHandler {
//        @Override
//        public void handle(HttpExchange t) throws IOException {
//            // 응답 메시지 작성
//            String response = "Hello, this is a simple web server!";
//            t.sendResponseHeaders(200, response.length());
//            OutputStream os = t.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//        }
//    }
//}

