package tools;

import java.io.File;

public class FilesList {
    private static String directories[] = new String[15];
    private static String tempDir = System.getProperty("java.io.tmpdir");
    private static String userHome = System.getProperty("user.home");

    public static void fillLinuxDir(){
        directories[0] = "/home/" + System.getProperty("user.name") + "/.local/share/Trash/files";
    }

    public static void fillWinDir(){
        directories[0] = tempDir;
        directories[1] = getFireFoxCache();
        directories[2] = getOperaCache();
        directories[3] = getMicrosoftCache();
        directories[4] = getChromeCache();
    }

    public static String[] getDirectories() {
        return directories;
    }

    public static String getFireFoxCache(){
        String path = userHome + "\\AppData\\local\\Mozilla\\Firefox\\Profiles\\";
        File file = new File(path);
        if (file.exists()){
        String list[] = file.list();
        path = path + list[0] + "\\Cache";
        return path;
        }
        else return null;
    }

    public static String getOperaCache(){
        String path = userHome + "\\AppData\\local\\Opera\\";
        File file = new File(path);
        if (file.exists()){
            String list[] = file.list();
            path = path + list[0] + "\\cache";
            return path;
        }
        else return null;
    }

    public static String getMicrosoftCache(){
        String path = userHome + "\\AppData\\Local\\Microsoft\\Windows\\WebCache\\";
        File file = new File(path);
        if (file.exists()){
            return path;
        }
        else return null;
    }

    public static String getChromeCache(){
        String path = userHome + "\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Cache\\";
        File file = new File(path);
        if (file.exists()){
            return path;
        }
        else return null;
    }
}