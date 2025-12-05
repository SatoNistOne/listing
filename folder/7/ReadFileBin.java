import java.io.*;

public class ReadFileBin {

    public static void readBinaryFile(String filename) throws IOException {
        File file = new File(filename);

        if (!file.exists()) {
            createSampleFile(filename);
        }

        try (InputStream is = new FileInputStream(file)) {
            long length = file.length();

            if (length > Integer.MAX_VALUE) {
                throw new IOException("Файл слишком длинный");
            }

            byte[] bytes = new byte[(int)length];
            int offset = 0;
            int numRead = 0;

            while (offset < bytes.length &&
                    (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                offset += numRead;
            }

            if (offset < bytes.length) {
                throw new IOException("Не удалось прочитать файл целиком");
            }

            System.out.println("Файл " + filename + " прочитан");
            System.out.println("Размер: " + bytes.length + " байт");

            System.out.println("Содержимое (hex):");
            for (int i = 0; i < bytes.length; i++) {
                System.out.printf("%02X ", bytes[i]);
                if ((i + 1) % 16 == 0) System.out.println();
            }
            System.out.println();
        }
    }

    private static void createSampleFile(String filename) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(
                new FileOutputStream(filename))) {
            dos.writeInt(100);
            dos.writeDouble(3.14159);
            dos.writeUTF("Тестовые данные");
        }
    }

    public static void main(String[] args) {
        try {
            readBinaryFile("file.bin");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}