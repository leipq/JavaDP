package kingdee.base.ssc.day009.reflect;

import java.util.Locale;
import java.util.ResourceBundle;

public class HelloXXX {

    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Message");
        String value = resourceBundle.getString("name");
        System.out.println(value);

        Locale locale = new Locale("en","US");
        ResourceBundle rb = ResourceBundle.getBundle("Message",locale);
        String vl = rb.getString("name");
        System.out.println(vl);

    }
}
