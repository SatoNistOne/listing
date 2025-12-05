import java.io.File;

public class sameDateToDirFiles {

    public static void sameDateToDirFiles(String dir) {

        long modified = System.currentTimeMillis();

        File walkDir = new File(dir);

        String[] dirList = walkDir.list();

        if (dirList == null) return; // проверка на null

        for (int i = 0; i < dirList.length; i++) {

            File f = new File(walkDir, dirList[i]);

            if (f.isDirectory()) {
                sameDateToDirFiles(f.getPath());
                continue;
            }

            f.setLastModified(modified);
        }
    }

    public static void main(String[] args) {
        String path = "C:\\Users\\patro\\Desktop\\test";
        sameDateToDirFiles(path);
        System.out.println("Даты файлов обновлены.");
    }
}
