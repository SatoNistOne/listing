import java.io.File;

public class FileUtils {

    public static void deleteDir(String dirPath) {
        File walkDir = new File(dirPath);
        String[] dirList = walkDir.list();

        if (dirList != null) {
            for (int i = 0; i < dirList.length; i++) {
                File f = new File(walkDir, dirList[i]);
                if (f.isDirectory()) {
                    deleteDir(f.getAbsolutePath());
                }
                f.delete();
            }
        }
        walkDir.delete();
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            deleteDir(args[0]);
            System.out.println("Директория удалена: " + args[0]);
        } else {
            System.out.println("Укажите путь к директории для удаления");
        }
    }
}