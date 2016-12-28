import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mcccr on 16-12-6.
 */
public class Server {
    public static List<Socket> socketList = Collections.synchronizedList(new ArrayList<Socket>());


    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(30000);
        while (true) {
            Socket s = ss.accept();
            socketList.add(s);
            new Thread(new ServerThread(s)).start();
        }
    }


}
