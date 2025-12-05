import java.io.*;

public class GrepInputStream extends FilterInputStream {
    String substring = null;
    BufferedReader br = null;

    public GrepInputStream(InputStream in, String substring) {
        super(in);
        this.br = new BufferedReader(new InputStreamReader(in));
        this.substring = substring;
    }

    public final String readLine() throws IOException {
        String line;
        do {
            line = br.readLine();
        } while ((line != null) && line.indexOf(substring) == -1);
        return line;
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Использование: java GrepInputStream <файл> <подстрока>");
            return;
        }

        String filename = args[0];
        String substring = args[1];

        try (FileInputStream fis = new FileInputStream(filename);
             GrepInputStream gis = new GrepInputStream(fis, substring)) {

            String line;
            while ((line = gis.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}