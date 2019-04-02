package kingdee.base.ssc.day008.ioFile;

import java.io.*;
import java.util.ResourceBundle;

public class FileCopyDemo {
    public static void main(String[] args) throws Exception {
        String filePath = ResourceBundle.getBundle("System").getString("basePath") + File.separator + "javaTest" + File.separator + "test.txt";
        File file = new File(filePath);
        if(!file.getParentFile().exists()){
            file.getParentFile().mkdirs();
        }

        String copyFilePath = ResourceBundle.getBundle("System").getString("basePath") + File.separator + "javaTest" + File.separator + "copytest.txt";
        File copyFile = new File(copyFilePath);
        if(!copyFile.getParentFile().exists()){
            copyFile.getParentFile().mkdirs();
        }

        byte data [] = new byte[1024];
        InputStream input = new FileInputStream(file);
        OutputStream output = new FileOutputStream(copyFile,true);
        int temp ;
        while((temp = input.read(data))!=-1){
            output.write(data,0,temp);
        }
        input.close();
        output.close();

    }
}
