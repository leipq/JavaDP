package kingdee.base.ssc.day008.ioFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class IOEechange {
    public static void main(String[] args) throws Exception {
        String filePath = ResourceBundle.getBundle("System").getString("basePath") + File.separator + "javaTest" + File.separator + "test.txt";
        File file = new File(filePath);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        FileInputStream fis = new FileInputStream(file);
        InputStreamReader fr = new InputStreamReader(fis);
        char data [] = new char[1024];
        int len = fr.read(data);
        System.out.println("["+new String(data,0,len)+"]");
    }
}
