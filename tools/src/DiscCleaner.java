import GUI.MainFrame;
import tools.FilesList;

import java.io.File;

public class DiscCleaner {
    public static void main(String[] args) {

        //fill fileLst according to OS
        switch (System.getProperty("os.nmame").toLowerCase()){
        case "Linux": FilesList.fillLinuxDir();
            break;
        case "Windows": FilesList.fillWinDir();
            break;
        case "MacOs": System.out.println("Doesn't support");
            break;
        }

        new MainFrame();

        String path[] = tools.FilesList.getDirectories();
        if (path != null){
            for (int i = 0; i < path.length; i++){
                if (path[i] != null){
                    File file = new File(path[i]);
                    tools.Files.delete(file);
                }
            }
        }

    }

}
