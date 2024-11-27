import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        // Start the HTTP server
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/game", new GameHandler());
        server.setExecutor(null); // Use default executor
        System.out.println("Server is running on http://localhost:8080");
        server.start();
    }

    static class GameHandler implements HttpHandler {
        private static final TextAdventure game = new TextAdventure();

        @Override
public void handle(HttpExchange exchange) throws IOException {
    if ("POST".equals(exchange.getRequestMethod())) {
        // Read the command from the request
        String command = new String(exchange.getRequestBody().readAllBytes());
        String response = game.processCommand(command);

        // Add CORS headers
        exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
        exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
        exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type");

        // Send the response
        exchange.sendResponseHeaders(200, response.getBytes().length);
        try (OutputStream os = exchange.getResponseBody()) {
            os.write(response.getBytes());
        }
    } else if ("OPTIONS".equals(exchange.getRequestMethod())) {
        // Handle preflight request
        exchange.getResponseHeaders().add("Access-Control-Allow-Origin", "*");
        exchange.getResponseHeaders().add("Access-Control-Allow-Methods", "POST, GET, OPTIONS");
        exchange.getResponseHeaders().add("Access-Control-Allow-Headers", "Content-Type");
        exchange.sendResponseHeaders(204, -1); // No content for OPTIONS
    } else {
        exchange.sendResponseHeaders(405, -1); // Method Not Allowed
    }

        if("POST".equals(exchange.getRequestMethod()))

        {
            // Read the command from the request
            String command = new String(exchange.getRequestBody().readAllBytes());
            String response = game.processCommand(command);

            // Send the response
            exchange.sendResponseHeaders(200, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }else
        {
            exchange.sendResponseHeaders(405, -1); // Method Not Allowed
        }
    }
}}
