package kingdee.base.ssc.day002.cloneable;

import java.io.Serializable;

public class EventTemplate implements Serializable {
    private String eventContent;
    private String eventSubject;

    public EventTemplate(String eventContent, String eventSubject) {
        this.eventContent = eventContent;
        this.eventSubject = eventSubject;
    }

    public String getEventContent() {
        return eventContent;
    }

    public void setEventContent(String eventContent) {
        this.eventContent = eventContent;
    }

    public String getEventSubject() {
        return eventSubject;
    }

    public void setEventSubject(String eventSubject) {
        this.eventSubject = eventSubject;
    }
}
