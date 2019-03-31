package kingdee.base.ssc.day008.ioFile;

import java.io.File;
import java.io.FileInputStream;
import java.util.ResourceBundle;

public class MyFileInputStream {
    public static void main(String[] args) throws Exception{
        String fileFullPath = ResourceBundle.getBundle("System").getString("basePath")+ File.separator+"Excel"+File.separator+"test.txt";
        FileInputStream fis = new FileInputStream(fileFullPath);

        int temp = fis.read();
        byte[] data  = new byte[1024];
        int foot = 0;
        while(temp  != -1){
            data[foot++] = (byte) temp ;
            temp = fis.read();
        }
        fis.close();
        System.out.println("["+new String(data,0,foot)+"]");
    }
}
