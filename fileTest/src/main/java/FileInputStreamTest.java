import java.io.*;

/**
 * Created by mcccr on 16-11-23.
 */
public class FileInputStreamTest {
    public static void text(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("FileInputStreamTest.java");

            byte[] bbuf = new byte[1024];
            int hasRead = 0;
            FileOutputStream fo = new FileOutputStream("text.txt");
            while ((hasRead = fis.read(bbuf)) > 0) {
//            System.out.println(new String(bbuf, 0, hasRead));
                fo.write(bbuf, 0, hasRead);
            }
            fo.write(66);
            fis.close();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }

//        FileReader fr = new FileReader("FileInputStreamTest.java");
//        char[] cbur = new char[32];
//        int hasRead1 = 0;
//
//        FileWriter writer = new FileWriter("text.txt");
//
//        while ((hasRead1 = fr.read(cbur)) > 0) {
//            //System.out.println(new String(cbur, 0, hasRead1));
//            writer.write(cbur, 0, hasRead1);
//        }


    }
}
