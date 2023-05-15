import java.net.*;
import java.io.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Connected to echo server: " + socket.getInetAddress().getHostAddress());
        
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while ((line = console.readLine()) != null) {
                out.println(line);
                String response = in.readLine();
                System.out.println("Received from server: " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            socket.close();
        }
    }
}
