package kingdee.base.ssc.day008.ioFile;

import org.junit.Test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

public class FileOperate {
    @Test
    public void test001()throws Exception{
        ResourceBundle rb = ResourceBundle.getBundle("System");
        File file = new File(rb.getString("basePath")+File.separator+"IDEA_WorkSpace"+File.separator+"Test"+File.separator+"test.txt");
        File parentFile = file.getParentFile();

        if(!parentFile.exists()){
            parentFile.mkdirs();
        }

        file.createNewFile();

        Thread.sleep(5000);
        file.delete();

    }

    @Test
    public void test002()throws Exception{
        ResourceBundle rb = ResourceBundle.getBundle("System");
        File file = new File(rb.getString("basePath")+File.separator+"IDEA_WorkSpace"+File.separator+"Test"+File.separator+"test.txt");

        File parentFile = file.getParentFile();
        if(!parentFile.exists()){
            parentFile.mkdirs();
        }


        if(!parentFile.exists()){
            parentFile.mkdirs();
        }
        if(!file.exists()){
            file.createNewFile();
        }

        System.out.println(file.length());
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date(file.lastModified())));
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getParent());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());
        System.out.println(file.getFreeSpace());
        System.out.println(file.getPath());
        System.out.println(file.list());
        System.out.println(file.isAbsolute());
        System.out.println(file.getTotalSpace());
        System.out.println(file.getUsableSpace());
        System.out.println(file.isHidden());
        File renameFile = new File(rb.getString("basePath")+File.separator+"IDEA_WorkSpace"+File.separator+"Test"+File.separator+"testrename.txt");
        renameFile.deleteOnExit();
        System.out.println(file.renameTo(renameFile));

        Thread.sleep(5000);
        file.delete();
        renameFile.delete();

    }


}
