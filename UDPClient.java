import java.net.*;
import java.io.*;

public class UDPClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the name of the audio file: ");
        String fileName = console.readLine();
        
        byte[] sendData = fileName.getBytes();
        InetAddress serverAddress = InetAddress.getByName("localhost");
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, 12345);
        socket.send(sendPacket);
        System.out.println("Sent request for file: " + fileName);

        byte[] receiveData = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.receive(receivePacket);
        String fileContents = new String(receivePacket.getData(), 0, receivePacket.getLength());
        System.out.println("Received file contents:\n" + fileContents);
        socket.close();
    }
}
