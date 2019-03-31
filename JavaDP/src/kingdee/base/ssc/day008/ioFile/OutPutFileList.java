package kingdee.base.ssc.day008.ioFile;

import java.io.File;
import java.util.ResourceBundle;

public class OutPutFileList {

    public static void main(String[] args)throws Exception {
        String path = ResourceBundle.getBundle("System").getString("basePath")+File.separator+"Excel";
        print(path);
    }

    public static void print(String path)throws Exception{
        File file = new File(path);
        if(file.exists()){
            print(file);
        }else{
            System.out.println("文件或者文件目录不存在！");
        }
    }

    public static void print(File file)throws Exception{
        if(file.isDirectory()){
            File result[] = file.listFiles();
            if(result !=null){

                for (int x = 0; x < result.length ; x++){
                    print(result[x]);
                }

            }
        }
        System.out.println(file.getCanonicalPath());
    }

}
