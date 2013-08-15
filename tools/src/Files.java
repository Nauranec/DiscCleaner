import java.io.File;

public class Files {

    public static void delete(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                java.io.File f = new java.io.File(dir + "\\" + children[i]);
                delete(f);
            }
            dir.delete();
        } else dir.delete();

    }
}
