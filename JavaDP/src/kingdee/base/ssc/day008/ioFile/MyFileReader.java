package kingdee.base.ssc.day008.ioFile;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.ResourceBundle;

public class MyFileReader {
    public static void main(String[] args) throws Exception {
        String filePath = ResourceBundle.getBundle("System").getString("basePath") + File.separator + "javaTest" + File.separator + "test.txt";
        File file = new File(filePath);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        Reader rd = new FileReader(file);
        char data [] = new char[1024];
        int len = rd.read(data);
        System.out.println("["+new String(data,0,len)+"]");

        rd.close();

    }
}
