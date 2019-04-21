package kingdee.base.ssc.day009.classLoader;

import java.io.*;

public class CryptoClass {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\1402936744\\Desktop\\MyCryptoDate.class"));
        FileOutputStream fos = new FileOutputStream(new File("C:\\Users\\1402936744\\Desktop\\NewMyCryptoDate.class"));
        crypto(fis,fos);
        fis.close();
        fos.close();
    }
    /**
     * 加密解密算法
     * */
    public static void crypto(InputStream fis, OutputStream fos)throws Exception{
        int temp = -1;
        while ((temp = fis.read()) != -1){
            fos.write(temp ^ 0xff );
        }
    }
}
