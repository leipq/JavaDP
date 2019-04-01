package kingdee.base.ssc.day008.ioFile;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ResourceBundle;

public class MyFileWriter {
    public static void main(String[] args) throws Exception {
        String filePath = ResourceBundle.getBundle("System").getString("basePath") + File.separator + "javaTest" + File.separator + "test.txt";
        File file = new File(filePath);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        Writer wt = new FileWriter(file);
        wt.write("你好，你在干嘛？");
        wt.flush();
        wt.close();
    }
}
