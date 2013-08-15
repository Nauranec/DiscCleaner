import GUI.MainFrame;

public class DiscCleaner {
    public static void main(String[] args) {
        FilesList.fillDir();
        new MainFrame();
        /*String path[] = FilesList.getDirectories();

        for (int i = 0; i < path.length; i++){
            if (path[i] != null){
                File file = new File(path[i]);
                Files.delete(file);
            }
        }*/

    }

}
