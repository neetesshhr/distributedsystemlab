import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;


public class Server {
    public static void main(String[] args) throws IOException {
        int number,temp;
        ServerSocket ss = new ServerSocket(1200);
        System.out.println("Waiting for Client");
        Socket s = ss.accept();
        Scanner ssc = new Scanner(s.getInputStream());
        PrintStream p = new PrintStream(s.getOutputStream());
        System.out.println("Connected to client ");
        number = ssc.nextInt();
        temp = number*2;
        System.out.println("Sending result to Client");
        p.println(temp);
    }
}
