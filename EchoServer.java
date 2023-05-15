import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(12345);
        System.out.println("Echo server is listening on port 12345...");
        
        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("A new client has connected: " + clientSocket.getInetAddress().getHostAddress());
            
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                
                String line;
                while ((line = in.readLine()) != null) {
                    System.out.println("Received from client: " + line);
                    out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                clientSocket.close();
            }
        }
    }
}
