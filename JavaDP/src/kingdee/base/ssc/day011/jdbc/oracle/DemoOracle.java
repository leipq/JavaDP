package kingdee.base.ssc.day011.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * JDBC纯驱动方式连接Oracle
 * 1 下载Oracle提供的驱动程序包
 *
 * 下载地址：
 *
 * http://www.oracle.com/technetwork/database/enterprise-edition/jdbc-112010-090769.html
 *
 * 下载哪个版本，跟你使用的JDK版本有关，比如使用JDK1.5，则下载ojdbc5.jar。若使用JDK1.6，则下载ojdbc6.jar。
 * 因为没有ojdbc7.jar或ojdbc8.jar，所以若使用JDK1.7或JDK1.8，也是下载ojdbc6.jar。
 *
 * 如果已经安装了Oracle服务器端或客户端，则无需再下载驱动程序包。Oracle服务器的JDBC驱动程序包目录位于$ORACLE_HOME\jdbc\lib下。
 *
 * 比如，笔者在D:\oracle目录下安装了Oracle 11g服务器端，则驱动程序包位于
 *
 * D:\app\1402936744\product\11.2.0\dbhome_1\jdbc\lib
 * **/
public class DemoOracle {
    private static final String DRIVER = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String USER = "";
    private static final String PASSWORD = "";
    public static void main(String[] args) throws Exception {

        //加载驱动
        Class.forName("oracle.jdbc.driver.OracleDriver");

        //获取连接
        Connection conn = DriverManager.getConnection(DRIVER,USER,PASSWORD);

        //执行CURD操作
        Statement state = conn.createStatement();

        state.execute("");

        //关闭连接
        state.close();
        conn.close();

    }
}
