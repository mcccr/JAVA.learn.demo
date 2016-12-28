import java.io.File;
import java.io.IOException;

/**
 * Created by mcccr on 16-11-23.
 */
public class FileTest {
    public static void test() throws IOException {
        File file = new File(".");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsoluteFile().getParent());
        System.out.println(file.getParent());
        File tmpfile = File.createTempFile("aaaa", ".txt", file);
        tmpfile.deleteOnExit();
        File newFile = new File(System.currentTimeMillis() + "heheda");
        System.out.println(newFile.exists());
        newFile.createNewFile();
        newFile.mkdir();
        String[] fileList = file.list();
        for (String fileName : fileList) {
            System.out.println(fileName);
        }
        for (File root : File.listRoots()) {
            System.out.println(root);
        }
    }
}
