import java.io.File;

/**
 * Created by mcccr on 16-11-23.
 */
public class FilenameFilterTest {
    public static void test() {
        File file = new File(".");
        String[] nameList = file.list((dir, name) -> name.endsWith(".java")||
                new File(name).isDirectory());
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}
