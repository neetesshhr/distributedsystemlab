import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.io.IOException;
import java.net.ServerSocket;

public class Client{
    public static void main(String[] args) throws IOException {
        int number, temp;
        Scanner sc = new Scanner(System.in);
        Socket s= new Socket("127.0.0.1",1200);
        Scanner ssc = new Scanner(s.getInputStream());
        PrintStream p = new PrintStream(s.getOutputStream());
        System.out.println("enter a number");
        number = sc.nextInt();
        p.println(number);
        temp = ssc.nextInt();
        System.out.println(temp);

    }
}

