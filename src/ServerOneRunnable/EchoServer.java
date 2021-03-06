package ServerOneRunnable;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public static void main(String[] args) throws IOException {
        // создаем серверный сокет на порту 1234
        ServerSocket server = new ServerSocket(1234);
        while (true) {
            System.out.println("Waiting...");
            // ждем клиента
            Socket socket = server.accept();
            System.out.println("Client connected!");
            //создаем клиента на своей стороне
            ClientOne client = new ClientOne(socket);
            //запускаем поток
            Thread thread = new Thread(client);
            thread.start();
        }
    }
}
