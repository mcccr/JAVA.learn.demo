import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

/**
 * Created by mcccr on 16-12-7.
 */
public class ServerThread implements Runnable {
    Socket s = null;
    BufferedReader br = null;


    public ServerThread(Socket s) throws IOException {
        this.s = s;
        this.br = new BufferedReader(new InputStreamReader(s.getInputStream()));
    }


    public void run() {
        try {
            String content = null;
            while ((content = readFromClient()) != null) {
                for (Socket s : Server.socketList) {
                    PrintStream ps = new PrintStream(s.getOutputStream());
                    ps.println(content + s);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String readFromClient() {
        try {
            return br.readLine();
        } catch (IOException e) {
            Server.socketList.remove(s);
        }
        return null;
    }
}
