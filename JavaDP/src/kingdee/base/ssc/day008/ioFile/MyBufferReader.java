package kingdee.base.ssc.day008.ioFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class MyBufferReader {
    public static void main(String[] args) throws Exception {
        File file = new File(ResourceBundle.getBundle("System").getString("basePath") + File.separator +"Excel" +
                File.separator +"success.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        StringBuffer buffer = new StringBuffer();
        String temp = null;
        while ((temp = br.readLine())!=null){
            buffer.append(temp).append("\n");
        }
        System.out.println(buffer.toString());
        br.close();
    }
}
