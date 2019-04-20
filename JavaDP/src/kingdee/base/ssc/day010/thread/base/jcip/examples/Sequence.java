package kingdee.base.ssc.day010.thread.base.jcip.examples;

import kingdee.base.ssc.day010.thread.base.jcip.annotations.GuardedBy;
import kingdee.base.ssc.day010.thread.base.jcip.annotations.ThreadSafe;

/**
 * Sequence
 *
 * @author Brian Goetz and Tim Peierls
 */

@ThreadSafe
public class Sequence {
    @GuardedBy("this") private int nextValue;

    public synchronized int getNext() {
        return nextValue++;
    }
}
