import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Created by mcccr on 16-12-6.
 */
public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 30000);
        new Thread(new ClientThread(socket)).start();

        PrintStream ps = new PrintStream(socket.getOutputStream());
        String content = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((content = br.readLine()) != null) {
            ps.println(content);
        }
    }
}
