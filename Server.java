import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    
    public void run() throws IOException{
        ServerSocket newSocketConnect = new ServerSocket(8080); 
        boolean serverStatus = true; //infinite loop server
        while(serverStatus){
            try(
                Socket soc = newSocketConnect.accept();
                PrintWriter value = new PrintWriter(soc.getOutputStream(), true);
                BufferedReader clientConnect = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            ){
                String data;
                while((data = clientConnect.readLine())!=null){
                    System.out.println(data);
                    value.println("\nServer connected.\n");
                }
                serverStatus = false;
            }
            catch(IOException e){
                System.out.println("\nIO error ! ; client closed connection\n");
                break;
            }
        }
        newSocketConnect.close();
        System.out.println("\nClient stopped. connection closed.\n");
    }
    public static void main(String[] args) throws IOException{
        Server newServer = new Server();
        newServer.run();
    }
}