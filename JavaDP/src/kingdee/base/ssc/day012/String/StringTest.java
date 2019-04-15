package kingdee.base.ssc.day012.String;
/**
 * 测试jdk对固定已知的String拼接的优化
 * jdk5以后，会自动优化为StringBuilder
 * 但是jdk9，却不会自动优化为StringBuilder，原因暂时未知
 *
 * */
public class StringTest {
    public static void main(String[] args) {
        String ss = "sdfsdf";
        ss += "dsfds" ;
        ss += "dsfds" ;
        ss += "dsfds" ;
        ss += "dsfds" ;
        ss += "dsfds" ;
        ss += "dsfds" ;
        ss += "dsfds" ;
        ss += "dsfds" ;

    }
}
