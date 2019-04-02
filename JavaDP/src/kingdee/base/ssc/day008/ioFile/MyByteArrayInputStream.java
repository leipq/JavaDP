package kingdee.base.ssc.day008.ioFile;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ResourceBundle;

public class MyByteArrayInputStream {
    public static void main(String[] args) throws Exception {
        String filePath1 = ResourceBundle.getBundle("System").getString("basePath") + File.separator + "javaTest" + File.separator + "test.txt" ;
        String filePath2 = ResourceBundle.getBundle("System").getString("basePath") + File.separator + "javaTest" + File.separator + "copytest.txt" ;

        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        if(!file1.getParentFile().exists()){
            file1.getParentFile().mkdirs();
        }
        if(!file2.getParentFile().exists()){
            file2.getParentFile().mkdirs();
        }

        InputStream input1 = new FileInputStream(file1);
        InputStream input2 = new FileInputStream(file2);
        byte data [] = new byte[1024];
        int temp;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        while ((temp = input1.read(data)) != -1){
            output.write(data,0,temp);
        }

        while ((temp = input2.read(data)) != -1){
            output.write(data,0,temp);
        }
        String str = output.toString();
        System.out.println(output);

        StringBuffer

        input1.close();
        input2.close();
        output.close();

    }
}
