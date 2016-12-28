import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mcccr on 16-11-28.
 */
public class KeyInTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//
        char[] a = new char[32];
        int b = 0;

        while((b = reader.read(a)) > 0) {
            if (new String(a, 0, b).equals("aaaa")){
                System.exit(1);
            }
            System.out.println(new String(a, 0, b));

        }
    }
}
