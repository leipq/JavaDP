package kingdee.base.ssc.day002.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreateItertorr implements Itertorr {
    private List<Object> list ;
    private int cursor = 0;
    public ConcreateItertorr(List<Object> list){
        this.list = list;
    }
    @Override
    public Object next() {
        Object obj = null;
        if(this.hasNext()){
            obj = this.list.get(cursor++);
        }
        return obj;
    }

    @Override
    public boolean hasNext() {
        if(cursor == list.size()){
            return false;
        }
        return true;
    }
}
