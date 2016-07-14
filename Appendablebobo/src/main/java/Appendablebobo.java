import java.io.IOException;
import java.io.*;

/**
 * Created by chenrong on 2016-07-14.
 */
public class Appendablebobo  {
    static void append(Appendable appendable, CharSequence csq) throws IOException {
        appendable.append(csq);
    }
    static void append(Appendable appendable, CharSequence csq, int start, int end) throws IOException {
        appendable.append(csq, start, end);
    }
    static void append(Appendable appendable, char c) throws IOException {
        appendable.append(c);
    }
    public static void main(String[] args) throws IOException {
        StringWriter writer = new StringWriter();

        append(writer, 'C');
        System.out.println(writer.toString());
        append(writer, 'h');
        System.out.println(writer.toString());
        append(writer, "e");
        System.out.println(writer.toString());
        CharSequence csq1 = "ck";
        append(writer, csq1);
        System.out.println(writer.toString());
        StringBuffer csq2 = new StringBuffer("OBaGangNangStyle");
        append(writer, csq2, csq2.length() - 5, csq2.length());
        System.out.println(writer.toString());

    }
}