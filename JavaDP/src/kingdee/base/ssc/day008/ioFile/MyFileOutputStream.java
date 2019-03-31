package kingdee.base.ssc.day008.ioFile;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ResourceBundle;

public class MyFileOutputStream {
    public static void main(String[] args) throws Exception {
        String fileFullPath = ResourceBundle.getBundle("System").getString("basePath")+ File.separator+"Excel"+File.separator+"test.txt";
        FileOutputStream fos = new FileOutputStream(fileFullPath,true);

        String str = "汪丽你好！";
        fos.write(str.getBytes());

        String str2 = "GGMM汪丽你好！";
        byte[] bys = str2.getBytes();
        for (int x = 0 ; x < bys.length ; x ++){
            fos.write(bys[x]);
        }
        String str3 = "dfsf你哈吧！";
        fos.write(str3.getBytes(),4,6);

        fos.close();

    }
}
