import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by mcccr on 16-12-2.
 */
public class InetAddressTest {
    public static void main() throws Exception {
        InetAddress ip = InetAddress.getByName("www.baidu.com");
        System.out.println("baidu是否可达" + ip.isReachable(2000));
        System.out.println(ip.getHostAddress());
        InetAddress local = InetAddress.getByAddress(new byte[]{10,108,66,(byte)142});
        System.out.println("本机是否可达" + local.isReachable(2000));
        System.out.println(local.getCanonicalHostName());




    }
}
