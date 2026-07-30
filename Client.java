import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.net.InetAddress;

public class Client {
    public void run() throws IOException{
        int port = 8080;
        InetAddress client = InetAddress.getByName("localhost");

        try(
            Socket clientSocket = new Socket(client, port);
            PrintWriter sendData = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader buffer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))
        ){
            Scanner input = new Scanner(System.in);

            while(true){
                System.err.println("send next request to server");
                sendData.println(input.nextLine());
                String response = buffer.readLine();
            }
        }
    }
    public static void main(String[] args) throws IOException{
        Client runClient = new Client();
        runClient.run();
    }
}
