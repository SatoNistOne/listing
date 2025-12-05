import java.io.*;
import java.util.Base64;

public class Base64Demo {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("usage: Base64Demo text");
            System.exit(1);
        }

        String text = args[0];
        String encoded = null;


        Base64.Encoder enc = Base64.getEncoder();
        encoded = enc.encodeToString(text.getBytes());
        enc = null;

        String decoded = null;
        try {

            Base64.Decoder dec = Base64.getDecoder();
            decoded = new String(dec.decode(encoded));
            dec = null;
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Закодировано: " + encoded);
        System.out.println("Декодировано: " + decoded);

        encoded = null;
        decoded = null;
    }
}
