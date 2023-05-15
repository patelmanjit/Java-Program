import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(12345);
        System.out.println("UDP server is listening on port 12345...");
        
        while (true) {
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            socket.receive(receivePacket);
            String fileName = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Received request for file: " + fileName);
            
            File file = new File(fileName);
            if (file.exists() && file.isFile()) {
                byte[] fileContents = new byte[(int) file.length()];
                FileInputStream fileInputStream = new FileInputStream(file);
                fileInputStream.read(fileContents);
                fileInputStream.close();
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                DatagramPacket sendPacket = new DatagramPacket(fileContents, fileContents.length, clientAddress, clientPort);
                socket.send(sendPacket);
                System.out.println("Sent file contents to client");
            } else {
                System.out.println("File not found");
            }
        }
    }
}