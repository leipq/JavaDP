package kingdee.base.ssc.day009.classLoader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyClassLoader extends ClassLoader {
    private String classDir;

    public MyClassLoader(){

    }
    public MyClassLoader(String classDir){
        this.classDir = classDir;
    }
    @Override
    protected Class findClass(String s) throws ClassNotFoundException {
        try {
            String fileName = classDir + File.separator + s;
            FileInputStream fis = new FileInputStream(new File(fileName));
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            CryptoClass.crypto(fis,bos);
            byte[] bytes = bos.toByteArray();
            return super.defineClass(s,bytes,0, bytes.length);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.findClass(s);
    }

}
