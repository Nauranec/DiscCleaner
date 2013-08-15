import java.io.File;

public class FilesList {
    public String directories[] = new String[15];

    public void fillDir(){
        directories[0] = System.getProperty("java.io.tmpdir");
        directories[1] = getFireFoxCache();
        directories[2] = getOperaCache();
        directories[3] = getMicrosoftCache();
        directories[4] = getChromeCache();
    }

    public String[] getDirectories() {
        return directories;
    }

    public String getFireFoxCache(){
        String path = System.getProperty("user.home") + "\\AppData\\local\\Mozilla\\Firefox\\Profiles\\";
        File file = new File(path);
        if (file.exists()){
        String list[] = file.list();
        path = path + list[0] + "\\Cache";
        return path;
        }
        else return null;
    }

    public String getOperaCache(){
        String path = System.getProperty("user.home") + "\\AppData\\local\\Opera\\";
        File file = new File(path);
        if (file.exists()){
            String list[] = file.list();
            path = path + list[0] + "\\cache";
            return path;
        }
        else return null;
    }

    public String getMicrosoftCache(){
        String path = System.getProperty("user.home") + "\\AppData\\Local\\Microsoft\\Windows\\WebCache\\";
        File file = new File(path);
        if (file.exists()){
            return path;
        }
        else return null;
    }

    public String getChromeCache(){
        String path = System.getProperty("user.home") + "\\AppData\\Local\\Google\\Chrome\\User Data\\Default\\Cache\\";
        File file = new File(path);
        if (file.exists()){
            return path;
        }
        else return null;
    }
}
