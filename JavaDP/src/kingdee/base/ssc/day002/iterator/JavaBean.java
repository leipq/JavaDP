package kingdee.base.ssc.day002.iterator;

import java.util.Date;

public class JavaBean {
    private String name;
    private Date date = new Date();

    public JavaBean(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    @Override
    public String toString(){
        return name+"--"+date.getTime();
    }
}
