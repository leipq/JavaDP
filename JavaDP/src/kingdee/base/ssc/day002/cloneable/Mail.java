package kingdee.base.ssc.day002.cloneable;

import java.util.ArrayList;

public class Mail implements Cloneable {
    private String receiver;
    private String subject;
    private String content;
    private String tail;

    private ArrayList<String> list;

    public Mail(EventTemplate et) {
        this.tail = et.getEventContent();
        this.subject = et.getEventSubject();
    }
    @Override
    public Mail clone(){
        Mail mail = null ;
        try {
            mail = (Mail) super.clone();
            mail.list = (ArrayList<String>) this.list.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return mail;
    }
    public void sendMail(Mail mail){
        System.out.println(mail.getContent()+"----"+mail.receiver +"hashCode:"+mail.list.hashCode());
    }
    public ArrayList<String> getList() {
        return list;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }
    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
