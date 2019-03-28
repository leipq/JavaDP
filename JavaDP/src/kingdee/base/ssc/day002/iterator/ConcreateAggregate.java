package kingdee.base.ssc.day002.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreateAggregate implements Aggregate {
    private List<Object> list = new ArrayList<>();
    @Override
    public boolean add(Object obj) {
        return list.add(obj);
    }

    @Override
    public boolean remove(Object obj) {
        return list.remove(obj);
    }

    @Override
    public Itertorr itertorr() {
        return new ConcreateItertorr(list);
    }
}
