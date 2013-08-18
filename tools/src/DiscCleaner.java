import GUI.MainFrame;
import tools.FilesList;

public class DiscCleaner {
    public static void main(String[] args) {
        FilesList.fillDir();
        new MainFrame();
        /*String path[] = tools.FilesList.getDirectories();

        for (int i = 0; i < path.length; i++){
            if (path[i] != null){
                File file = new File(path[i]);
                tools.Files.delete(file);
            }
        }*/

    }

}
